package com.ar.collections.linkedList;

import java.util.LinkedList;

public class AgeFilter {
     public static void main(String[] args) {
         LinkedList<Integer> ages = new LinkedList<>();
         ages.add(22);
         ages.add(25);
         ages.add(19);
         ages.add(30);
         ages.add(27);
         ages.add(18);
         for(Integer age : ages){
             if(age >= 21){
                 System.out.println(age);
             }
         }
    }
}
