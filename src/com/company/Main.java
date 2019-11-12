package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        // Utworzenie obiektu klasy User
        User user1 = new User();
        // Wywołanie metody dla obiektu user1
        System.out.println(user1.toString());
        // Modyfikacja pól obiektu
        user1.name = "Michał";
        user1.registrationDate = LocalDateTime.now();
        user1.status = true;
        System.out.println(user1.toString());
        System.out.println(user1.hashCode());
        System.out.println(user1.getClass());

        User user2 = new User();
        System.out.println(user2);
        System.out.println(user2.hashCode());
        System.out.println(user2.getClass());

        // Wykorzystanie konstruktora
        User user3 = new User(
                1,
                "Adam",
                "Kot",
                LocalDateTime.now(),
                true,
                10000.);
        System.out.println(user3);
    }
}
