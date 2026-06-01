package com.ar.exceptionHandling.NullPointerException;

public class Test6 {
    public static void main(String[] args) {
        String str = null;
    try{
        System.out.println("A");
        if(str == null) {
            System.out.println("B");
        }
        System.out.println(str.length());
        System.out.println("c");
    }catch(NullPointerException e){
        System.out.println("D");
    }}
}

