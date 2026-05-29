package com.ar.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        try{
            account.deposit(100);
            account.withdraw(300);
            account.withdraw(400);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
