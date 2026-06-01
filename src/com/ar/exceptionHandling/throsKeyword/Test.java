package com.ar.exceptionHandling.throsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fs = new FileReader("abc.txt");
        System.out.println("Done");
    }
}
