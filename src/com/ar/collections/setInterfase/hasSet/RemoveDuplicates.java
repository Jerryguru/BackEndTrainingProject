package com.ar.collections.setInterfase.hasSet;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
     public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("jerry");
         list.add("Jerry");
         list.add("Jerry Paramesh");
         list.add("Jerry");
         list.add("Jerry Guru");
         list.add("Jerry");
         list.add("Jerry Guru");
         System.out.println(list);
         System.out.println(list.size());

         HashSet<String> set = new HashSet<>(list);
         System.out.println(set);
         System.out.println(set.size());
    }
}
