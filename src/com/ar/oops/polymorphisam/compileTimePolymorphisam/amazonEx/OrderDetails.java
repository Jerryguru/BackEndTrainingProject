package com.ar.oops.polymorphisam.compileTimePolymorphisam.amazonEx;

public class OrderDetails {
     public  static void main(String[] args) {
        ProductOrder p1 = new ProductOrder("jerry paramesh","Hyderabad","I phone 17pro max");

        p1.displayCustomerDetails();
        p1.oderProduct("Laptop");
        p1.oderProduct("Mobile",2);
        p1.oderProduct("Watch",3,6999);

    }
}
