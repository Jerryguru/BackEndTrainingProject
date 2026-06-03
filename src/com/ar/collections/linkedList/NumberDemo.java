package com.ar.collections.linkedList;

import java.util.LinkedList;

public class NumberDemo {
     public static void main(String[] args) {
         LinkedList<Integer> number = new LinkedList<>();
         number.add(86);
         number.push(86);
         number.add(99);
         number.push(33);
         number.add(41);
         number.addFirst(91);
         for(Integer  num : number){
             if(num % 2 == 0){ // Printing only even numbers
                 System.out.println(num);
             }
         }
    }
}
