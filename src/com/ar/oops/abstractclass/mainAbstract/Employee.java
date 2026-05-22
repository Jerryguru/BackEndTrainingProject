package com.ar.oops.abstractclass.mainAbstract;

 abstract  class Employee {
     //Instance variable
     String name ;
     //Static variable
     static String company = "Infosys";
     // final variable
     final int employeeid;

     public Employee(int employeeid, String name) {
         this.employeeid = employeeid;
         this.name = name;
     }
     // abstract method -> for abstract there is no body

     abstract void calculateSalary();

     // Concrete method (with body)
     void displayEmployee() {
         System.out.println("Here  the Employee Name: " + name);
         System.out.println("Here the Employee ID number is: " + employeeid);
     }
     // Static method
     static void companyDetails() {
         System.out.println("Here the Company Name: " + company);
     }

     // Final method
     final void rules() {
         System.out.println("Here the Employees must follow company rules.");
     }
 }
