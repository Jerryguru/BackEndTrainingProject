package com.ar.collections.arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
     public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("java");
         list.add("SpringBoot");
         list.add("Hibernet");
         System.out.println(list);
         System.out.println(list.get(1));
         System.out.println(list.contains("java"));
         System.out.println(list.size());
         //System.out.println(list.remove("SpringBoot "));
         list.remove("SpringBoot");
         System.out.println(list);

    }
}
