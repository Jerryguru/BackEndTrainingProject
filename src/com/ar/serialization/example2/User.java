package com.ar.serialization.example2;

import java.io.*;

// Class must implement Serializable
class User implements Serializable {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


