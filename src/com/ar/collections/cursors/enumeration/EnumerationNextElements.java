package com.ar.collections.cursors.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationNextElements {
     public static void main(String[] args) {
         Vector<String> v = new Vector<>();
         v.add("Java");
         v.add("Spring");
         v.add("Testing");
         Enumeration<String>e = v.elements();
        // System.out.println(e.nextElement());
         System.out.println("********************");
         while(e.hasMoreElements()) {
             System.out.println(e.nextElement());
         }
    }
}
