package com.ar.collections.setInterfase.hasSet;

import java.util.HashSet;

public class Example2 {
     public static void main(String[] args) {
         /*HashSet<String> set =new HashSet<>();
         System.out.println(set.add("java"));
         System.out.println(set.add("java"));

         System.out.println(set.remove("java"));
         System.out.println(set.remove("java"));
         System.out.println(set);
*/
         HashSet<Integer> set = new HashSet<>();
         set.add(86);
         set.add(86);
         set.add(99);
         set.add(33);
         set.add(41);
         System.out.println(set.size());
         set.remove(20);
         System.out.println(set.contains(20));
         System.out.println(set.contains(30));
         System.out.println(set.size());
    }
}
