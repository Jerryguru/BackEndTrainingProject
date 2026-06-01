package com.ar.exceptionHandling.NullPointerException;

import com.ar.oops.polymorphisam.compileTimePolymorphisam.foodService.Customar;

class Customer {
    String name = " Jerry ";
    String getName(){
        return name;
    }
}
public class Test5 {
    public static void main(String[] args) {
        Customer customer = null;
        System.out.println(customer.getName());
    }
}
