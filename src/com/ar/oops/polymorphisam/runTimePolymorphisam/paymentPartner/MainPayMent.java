package com.ar.oops.polymorphisam.runTimePolymorphisam.paymentPartner;

public class MainPayMent {
     public static void main(String[] args) {
         Payment p;
         p=new PhonePay();
         p.pay();
         p=new GooglePay();
         p.pay();
         p=new Paytm();
         p.pay();


    }
}
