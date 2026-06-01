package com.ar.exceptionHandling.throwKeyword;

public class BankApp {
     public static void main(String[] args) {
         try{
             int balance = 1000;
             int Withdrawn = 5000;
             if (Withdrawn > balance){
                 throw  new ArithmeticException("Insufficient Balance");
             }
             System.out.println("Money WithDrawn");
         }catch (ArithmeticException e){
             System.out.println(e.getMessage());
         }

    }
}
