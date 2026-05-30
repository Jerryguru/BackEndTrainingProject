package com.ar.exceptionHandling.arithmeticException;

public class ArithmeticExceptionExample2 {
    public static void main(String[] args) {
        try{
            int amount = 1000;
            int persons = 0;
            int share = amount/persons;
            System.out.println(share);
        } catch (ArithmeticException e){
            System.out.println("Cannot Divid by Zero");
        }finally {
            System.out.println("Transections Completed");
        }

    }
}
