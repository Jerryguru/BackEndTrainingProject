package com.ar.oops.polymorphisam.runTimePolymorphisam.paymentPartner;

public class Paytm  extends  Payment{
    @Override
    public void pay(){
        System.out.println("Payment Done By using Patm:");
    }
}
