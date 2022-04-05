package com.geekbrains;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        firstMethod();
        try {
            secondMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void firstMethod() {
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        multiplication(arr);
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static void secondMethod() throws InterruptedException {
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        float[] array1 = new float[HALF];
        float[] array2 = new float[HALF];
        System.arraycopy(arr, 0, array1, 0, HALF);
        System.arraycopy(arr, HALF, array2, 0, HALF);

        Thread thread = new Thread(() -> System.arraycopy(multiplication(array1), 0, arr, 0, HALF));
        Thread thread1 = new Thread(() -> System.arraycopy(multiplication(array2), 0, arr, HALF, HALF));
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static float[] multiplication(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }
}
