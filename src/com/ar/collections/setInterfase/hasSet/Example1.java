package com.ar.collections.setInterfase.hasSet;

import java.util.HashSet;

public class Example1 {
     public static void main(String[] args) {
         HashSet<String> set = new HashSet<>();
         set.add("JJJ");
         set.add("GGG");
         set.add("PPP");
         set.add("YYY");
         System.out.println(set);
         System.out.println("******************************");
         HashSet<String> set1 = new HashSet<>();
         set1.add("SSS");
         set1.add("kkk");
         System.out.println(set1);
         System.out.println("************************************");
         System.out.println(set.addAll(set1));
         System.out.println(set);
         System.out.println(set.addAll(set1));
         System.out.println(set);
         System.out.println("***************************************");

         System.out.println(set.remove(0));
         System.out.println(set.remove("kkk"));
         System.out.println(set);

    }
}
