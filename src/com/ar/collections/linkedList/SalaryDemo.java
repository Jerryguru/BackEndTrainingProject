package com.ar.collections.linkedList;

import java.util.LinkedList;

public class SalaryDemo {
     public static void main(String[] args) {
         LinkedList<Integer> Salary = new LinkedList<>();
         Salary.add(56000);
         Salary.add(66000);
         Salary.add(77000);
         Salary.addFirst(46000);
         Salary.addLast(88000);
         int max = Salary.getFirst();
         for(Integer salary : Salary){
             if(salary > max){
                 max=salary;
             }

         }
         System.out.println("Heighest Salary is: "+max);

    }
}
