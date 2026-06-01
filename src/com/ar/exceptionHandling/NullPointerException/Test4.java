package com.ar.exceptionHandling.NullPointerException;

public class Test4 {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println("A");
            System.out.println(str.length());
            System.out.println("B");
        }catch (NullPointerException e){
            System.out.println("c");
        }finally {
            System.out.println("D");
        }
    }
}
