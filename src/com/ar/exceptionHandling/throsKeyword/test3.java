package com.ar.exceptionHandling.throsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class test3 {
    static void display () throws FileNotFoundException {
        FileReader fir = new FileReader("abc.txt");
        System.out.println("A");

    }
   public static void main(String[]args) {


        try {
            display();
        } catch (FileNotFoundException e) {
            System.out.println("B");;
        }
        System.out.println("c");
    }
}
