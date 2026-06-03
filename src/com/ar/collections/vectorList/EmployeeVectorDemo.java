package com.ar.collections.vectorList;

import java.util.Vector;

public class EmployeeVectorDemo {
     public static void main(String[] args) {
         Vector<String> employees = new Vector<>();
         employees.add("paramesh");
         employees.add("jerry");
         employees.add("Guru");

         System.out.println(employees);

         System.out.println("Employee: "+employees);
         System.out.println("First Employee Name was: "+ employees.firstElement());
         System.out.println("Last Employee Name was: "+employees.lastElement());
         System.out.println("Capasity of All Employess: "+employees.capacity());
         System.out.println("Total Size of Employess: "+employees.size());
         System.out.println("Removing the employee:"+employees.remove(2));
         System.out.println(employees);
         System.out.println("contains if jerry is there are not:" +employees.contains("jerry"));
         System.out.println("Employee at index -1:"+ employees.get(1));


    }
}
