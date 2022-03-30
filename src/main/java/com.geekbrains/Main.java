package com.geekbrains;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Первое задание
        List<String> words = Arrays.asList(
                "первый", "второй", "третий", "четвертый", "нуль",
                "первый", "третий", "второй", "третий", "четвертый",
                "первый", "нуль", "второй", "четвертый", "нуль",
                "нуль", "первый", "нуль", "второй", "третий"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Первоначальный массив" + words);
        System.out.println("Уникальные слова" + unique);
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

        // Второе задание

        Phonebook phonebook = new Phonebook();

        phonebook.add("223344", "Кот");
        phonebook.add("22334411", "Крот");
        phonebook.add("22334499", "Бродяга");
        phonebook.add("22334488", "Кот");
        phonebook.add("22334422", "Крот");

        System.out.println("-----------------");
        System.out.println("Получаем номера");
        phonebook.get("Крот");
        phonebook.get("Кот");
        phonebook.get("Бродяга");
        System.out.println("-----------------");

    }
}
