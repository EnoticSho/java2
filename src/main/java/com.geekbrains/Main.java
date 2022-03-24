package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "e", "4"}, {"1", "2", "3", "4"}, {"1", "2", "1", "4"}, {"1", "2", "3"}};
        try {
            System.out.println(sumArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4){
            throw new MyArraySizeException("Неверный размер массива");
        }
        for (String[] strings : array) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке [" + i + "][" + j + "] лежат неверные данные");
                }
            }
        }
        return sum;
    }
}
