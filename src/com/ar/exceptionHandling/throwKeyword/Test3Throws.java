package com.ar.exceptionHandling.throwKeyword;

import java.io.FileNotFoundException;

public class Test3Throws {
    static void readFile()throws FileNotFoundException{
        System.out.println("Reading File");
    }

     public static void main(String[] args) {
try{
    readFile();
}catch (FileNotFoundException e){
    System.out.println("File Error");
}
         System.out.println("Done");
    }
}
