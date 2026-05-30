package com.ar.exceptionHandling.NullPointerException;

public class BankApp {
    public static void main(String[] args) {
        try{

            String customerName = null;
            System.out.println(customerName.length());
        }catch(NullPointerException e ){
            System.out.println("customaer Name Not Found");


        }finally {
            System.out.println("Transection Completed");
        }
    }
}
