package com.ar.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListExample4 {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add("ppp");
         list.add("ttt");
         list.add("yyy");
         list.add("ttt");
         list.add("zzz");
         System.out.println(list);
         //Adding an Element n the middle
         list.add(list.size()/2,"X");
         System.out.println("Linked List After Adding in the middle1: "+list);
         // Removing the element in the middle
         list.remove(list.size()/3);
         System.out.println("LinkedList after removing in the middle1: "+list );



         list.remove(list.size()/2);
    }
}
