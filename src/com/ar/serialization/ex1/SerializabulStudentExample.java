package com.ar.serialization.ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializabulStudentExample {
     public static void main(String[] args) throws IOException {
         Student s1 = new Student(101,"jerry");
         FileOutputStream fos = new FileOutputStream("Student.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(s1);
         oos.close();
         fos.close();
         System.out.println("object serialized sucessfully");

    }
}
