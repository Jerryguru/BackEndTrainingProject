package com.ar.collections.cursors.listIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorExample3 {
     public static void main(String[] args) {
       //  List<Integer> list = List.of(10,20);
         List<Integer> list = new ArrayList<>();
         list.add(10);
         list.add(20);

         Iterator<Integer> itr = list.iterator();

         System.out.println(itr.hasNext());
         System.out.println(itr.next());

         System.out.println(itr.hasNext());
         System.out.println(itr.next());

         System.out.println(itr.hasNext());
         System.out.println(itr.next());
    }
}
