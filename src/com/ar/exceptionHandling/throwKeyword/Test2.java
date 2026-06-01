package com.ar.exceptionHandling.throwKeyword;

public class Test2 {
    static void  checkAge(int Age){
        if (Age< 18){
            throw new ArithmeticException("Not Eligibal");
        }
        System.out.println("Eligible");
    }

     public static void main(String[] args) {
        try {
            checkAge(17);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Appliction End");
        }

    }
}
