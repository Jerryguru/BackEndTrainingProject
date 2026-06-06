package com.ar.collections.cursors.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample4 {
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
         list.add(2);
         list.add(3);
         list.add(6);
         list.add(8);
         list.add(20);
         list.add(30);
         list.add(60);
         list.add(80);
         System.out.println(list);

         ListIterator<Integer> itr = list.listIterator();
         while (itr.hasNext()){
             System.out.println(itr.nextIndex()+ "------------>"+itr.next());
         }
         System.out.println("********************");
         while (itr.hasPrevious()){
             System.out.println(itr.previousIndex()+"------------------------->"+itr.previous());
         }
    }
}
