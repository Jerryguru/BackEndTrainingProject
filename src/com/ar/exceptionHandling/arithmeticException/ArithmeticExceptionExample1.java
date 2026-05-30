package com.ar.exceptionHandling.arithmeticException;

import org.w3c.dom.ls.LSOutput;

public class ArithmeticExceptionExample1 {
    public static void main(String[] args) {


    int n = 10 ;
    int o =0 ;

    try{
        int p = n/o ;
        System.out.println("Answer: "+ p);
    }catch(ArithmeticException e ){
        System.out.println("Error: Division by 0 is not possible");
    }}

}
