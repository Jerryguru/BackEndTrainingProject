package com.ar.collections.stack;

import java.util.Stack;

public class Test {
     public static void main(String[] args) {
         Stack<Integer> s = new Stack<>();

         s.push(10);
         s.push(20);

         System.out.println(s.peek());
         System.out.println(s.pop());
         System.out.println(s);

    }
}
