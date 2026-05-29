package com.ar.serialization.ex1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationExample  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s1 = (Student) ois.readObject();
        ois.close();
        fis.close();
        System.out.println("Id: "+s1.id);
        System.out.println("Name: "+s1.name);


    }
}
