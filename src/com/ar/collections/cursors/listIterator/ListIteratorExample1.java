package com.ar.collections.cursors.listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {
     public static void main(String[] args) {
         List<String> list = new LinkedList<>();
         list.add("param");
         list.add("Guru");
         list.add("Jerry");
         list.add("Yadav");
         System.out.println(list);

         // perform List Iterator
         ListIterator<String> listIterator = list.listIterator();
          while (listIterator.hasNext()){
              System.out.println(listIterator.next());
          }


    }
}
