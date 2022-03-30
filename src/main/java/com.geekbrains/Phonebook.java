package com.geekbrains;

import java.util.*;

public class Phonebook {

    private HashMap<String, String> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String number, String surname) {
        book.put(number, surname);
        System.out.printf("В справочник добавлен(а) %s с номером %s", surname, number);
        System.out.println();
    }

    public void get(String surname) {
        System.out.printf("Номер телефона %s : ", surname);
        for (String key : book.keySet()){
            if(book.get(key).equals(surname)){
                System.out.println(key);
            }
        }
    }
}
