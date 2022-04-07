package com.geekbrains;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Thread thread = new Thread(() -> {
                try {
                    while (true) {
                        String str = in.readUTF();
                        if (str.equalsIgnoreCase("exit")) {
                            out.writeUTF("exit");
                            break;
                        }
                        System.out.println("message from client: " + str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread.start();

            while (true) {
                String strO = scanner.nextLine();
                out.writeUTF(strO);
                if ("exit".equalsIgnoreCase(strO)) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
