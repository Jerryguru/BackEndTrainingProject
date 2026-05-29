package com.ar.exceptionHandling;

public class BankAccount {
    private double balance;
    public BankAccount( double balance){
        this.balance = balance;

    }
    // Method -1 : Deposit
    public void deposit (double amount){
        balance += amount ;
        System.out.println("Amount Deposited: "+amount);
        System.out.println("Current Balance: "+balance);

    }
    // Method -2 : Withdraw
public void withdraw (double amount) throws InsufficientBalanceException {
        if(amount > balance )
            throw  new InsufficientBalanceException("Withdraw Failed! Insufficient Amount");

        balance -= amount;
    System.out.println("Amount Withdrawn: "+ amount);
    System.out.println("Remaining Balance: "+ balance);
}



}

