package com.ar.exceptionHandling.NullPointerException;

public class Test8 {
    public static void main(String[] args) {
        try{
            System.out.println("Login Started");
           // String user = null ;
            String user = "Jerry";
            System.out.println(user.length());
            System.out.println("Login Sucessful");
        }catch (NullPointerException e){
            System.out.println("Login Failed");
        }finally {
            System.out.println("Login Log Saved");
        }
        System.out.println("Appliction Running");

    }
}
