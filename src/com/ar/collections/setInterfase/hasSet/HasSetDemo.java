package com.ar.collections.setInterfase.hasSet;

import java.util.HashSet;

public class HasSetDemo {
   public static void main(String[] args) {
       HashSet<String> names = new HashSet<>();
       names.add("Jerry");
       names.add("Jerry Paramesh");
       names.add("Jerry");
       names.add("Jerry Guru");
       names.add("Jerry");
       names.add("Jerry Guru");
       System.out.println(names);
    }
}
