package com.ar.collections.linkedList;

import java.util.LinkedList;

public class EmployeesDemo {
     public static void main(String[] args) {
         LinkedList<String> employees = new LinkedList<>();
         employees.add("Bharath");
         employees.add("Vishall");
         employees.add("Mani");
         employees.add("Harith");
         for(int i = 0 ; i< employees.size();i++){
             System.out.println(employees.get(i));
         }

    }
}
