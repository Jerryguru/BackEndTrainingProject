package com.ar.collections.cursors.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationHasMoreElements {
     public static void main(String[] args) {
         Vector<String> vector = new Vector<>();
         vector.add("Jerry");
         vector.add("Guru");
         vector.add("Paramesh");
         vector.add("Yadav");
         System.out.println(vector);
         Enumeration<String> enumeration = vector.elements();
         while (enumeration.hasMoreElements()){
             System.out.println(enumeration.nextElement());
             System.out.println(enumeration.hasMoreElements());
         }
    }
}
