package com.ar.exceptionHandling.throsKeyword;

public class Tes {
    static void display()throws ArithmeticException{
        int x = 10/0;
    }
    public static void main(String[] args) {
        display();
    }
}
