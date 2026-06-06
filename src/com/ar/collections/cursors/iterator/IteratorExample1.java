package com.ar.collections.cursors.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample1 {
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
         list.add(10);
         list.add(15);
         list.add(20);
         list.add(25);
         list.add(30);
         Iterator<Integer> itr = list.iterator();
         while (itr.hasNext()){
             Integer num = itr.next();
             if(num % 2 != 0){
                 itr.remove();
             }
         }
         System.out.println(list);
    }
}
