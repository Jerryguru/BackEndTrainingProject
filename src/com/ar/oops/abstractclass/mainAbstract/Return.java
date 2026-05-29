package com.ar.oops.abstractclass.mainAbstract;

public class Return {
    public  static void main(String[] args) {
        // // Runtime polymorphism
        Employee e1 = new Developer(8686,"Paramesh",87643 , 20000);
// Concrete method

        e1.displayEmployee();
        System.out.println();
// Abstract method implementation
        e1.calculateSalary();
        System.out.println();
        // Final method
        e1.rules();
        System.out.println();
        // Static method
        Employee.companyDetails();

    }
}
