package com.ar.oops.polymorphisam.compileTimePolymorphisam.amazonEx;

public class Customer {
  private   String customerName;
  private   String customerCity;

    public Customer(String customerName, String customerCity){
        this.customerName= customerName;
        this.customerCity = customerCity;
    }



    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }


}
