package com.ar.exceptionHandling.throwKeyword;

public class Test1 {
    static void main() {
        int balance = 1000;
        int WithdrawAmount = 5000;
        if(WithdrawAmount > balance ){
            throw new ArithmeticException("Insufficient Balance");
        }
        System.out.println("Money Withdrawn not done because of insufficient Balance");
    }
}
