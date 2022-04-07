package com.geekbrains;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private Socket socket;
    private DataInputStream inputStream;
    private DataOutputStream outputStream;

    public static void main(String[] args) {
        EchoClient echoClient = new EchoClient();
        echoClient.start();
    }

    private void start() {
        try {
            openConnection();
            final Scanner scanner = new Scanner(System.in);
            while (true) {
                final String msg = scanner.nextLine();
                outputStream.writeUTF(msg);
                if ("exit".equalsIgnoreCase(msg)) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void openConnection() throws IOException {
        socket = new Socket("localhost", 8189);
        inputStream = new DataInputStream(socket.getInputStream());
        outputStream = new DataOutputStream(socket.getOutputStream());
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    final String message = inputStream.readUTF();
                    if (message.equalsIgnoreCase("exit")) {
                        outputStream.writeUTF("exit");
                        break;
                    }
                    System.out.println("message from server: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeConnection();
            }
        });
        thread.start();
    }

    public void closeConnection() {
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
