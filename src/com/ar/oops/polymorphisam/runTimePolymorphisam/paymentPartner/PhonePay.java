package com.ar.oops.polymorphisam.runTimePolymorphisam.paymentPartner;

public class PhonePay  extends Payment{
    @Override
    public void pay(){
        System.out.println("Payment Done by using PhonePay:");
    }
}
