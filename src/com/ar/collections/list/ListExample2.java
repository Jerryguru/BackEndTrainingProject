package com.ar.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add(0,"ppp");
         list.add(1,"yyy");
         list.add(2,"ttt");
         list.add(3,"zzz");
         System.out.println(list);
         list.add(4,"jjj");
         System.out.println(list);
         list.add(0,"Paramesh");
         System.out.println(list);
         list.add(4,"lll");
         System.out.println(list);
    }
}
