package org.example;

import lombok.Data;

@Data
public class User {
    String name, lastname;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}
