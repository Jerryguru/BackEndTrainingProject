package com.ar.oops.polymorphisam.runTimePolymorphisam.paymentPartner;

public class GooglePay extends Payment{
    @Override
    public void pay(){

        System.out.println("Payment Done by using GooglePay");
    }
}
