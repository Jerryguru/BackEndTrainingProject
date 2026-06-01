package com.ar.exceptionHandling.NullPointerException;

public class Test3 {
    public static void main(String[] args) {
        String str = null ;
        try
        {
            System.out.println(str.toUpperCase());
    }catch (NullPointerException e){
            System.out.println("Here We Can See a Null Object");

        }finally {
            System.out.println("Program End");
        }
        }
}
