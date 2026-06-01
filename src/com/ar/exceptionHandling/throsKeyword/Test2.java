package com.ar.exceptionHandling.throsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader  fr = new FileReader("abc.txt");
    }
}
