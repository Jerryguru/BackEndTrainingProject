package com.ar.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add(0,"ppp");
         list.add(1,"ttt");
         list.add(2,"yyy");
         list.add(3,"ttt");
         list.add(4,"zzz");
         System.out.println(list);
         System.out.println(list.indexOf("yyy"));
         System.out.println(list.indexOf("param"));
    }
}
