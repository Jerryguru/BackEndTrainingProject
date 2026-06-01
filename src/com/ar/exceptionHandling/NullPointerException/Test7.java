package com.ar.exceptionHandling.NullPointerException;

public class Test7 {
    public static void main(String[] args) {
        try{
            System.out.println("We are  practising on finally keyword");
            int x = 10/0;
            System.out.println("B");
        }catch (ArithmeticException e ){
            System.out.println("Here the int num is not divided by 0 ");
        }
        finally {
            System.out.println("Print this if exception done are not");
        }
        System.out.println("Finally the rest u seeing is above");


    }
}
