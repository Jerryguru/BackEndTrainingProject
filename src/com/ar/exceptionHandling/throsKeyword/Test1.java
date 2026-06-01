package com.ar.exceptionHandling.throsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {
    public static void main(String[] args) {
        try{
            FileReader fir = new FileReader("abc.txt");

        }catch (FileNotFoundException e ){
            System.out.println("File Not Fouund ");
        }
        finally {
            System.out.println("It is provided by text file");
        }
    }
}
