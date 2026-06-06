package com.ar.collections.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListExample {
     public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("AAA");
         list.add("BBB");
         list.add("CCC");
         list.add("DDD");
         list.add("EEE");
         System.out.println(list);
         System.out.println("*******************************");
         Object [] array = list.toArray();
         for(Object ar : array){
             System.out.println(ar);
         }
         System.out.println("_________________________");
         for(int i=0; i< array.length;i++){
             System.out.println(array[i]);
         }

    }
}
