package com.ar.oops.inheritance.hierarchicalEx2;

public class MainWork {
    public  static void main(String []args) {
        Developerr d = new Developerr("Capgemini","Hyderabad","paramesh");
        d.getCompanyName();
        d.coding();
        System.out.println("*********************");
        Tester t = new Tester("Wipro","Bangalore","jerry");
        t.companyDetails();
        t.testing();
    }
}
