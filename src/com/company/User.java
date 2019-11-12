package com.company;

// deklaracja klasy User w projekcie

import java.time.LocalDateTime;

public class User {
    // pola
    int user_id;
    String name;
    String lastname;
    LocalDateTime registrationDate;
    boolean status;
    double salaryNet;

    // metody


    public User() {}
    public User(int user_id,
                String name,
                String lastname,
                LocalDateTime registrationDate,
                boolean status,
                double salaryNet) {
        this.user_id = user_id;
        this.name = name;
        this.lastname = lastname;
        this.registrationDate = registrationDate;
        this.status = status;
        this.salaryNet = salaryNet;
    }

    // toString - napisowa reprezentacja obiektu
    // ALT + Insert - toString()
    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", registrationDate=" + registrationDate +
                ", status=" + status +
                ", salaryNet=" + salaryNet +
                '}';
    }
}
