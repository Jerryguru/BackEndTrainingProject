package com.ar.collections.stack;

import java.util.Stack;

public class BookStackDemo {
     public  static void main(String[] args) {
         Stack<String> books = new Stack<>();
         books.push("Java");
         books.push("Collections");
         books.push("AdvancedJava");
         System.out.println("Books that i Collected: "+books);
         System.out.println("Book that i picked Top Book: "+books.peek());
         System.out.println("Book that i removed: "+books.pop());
         System.out.println("Books that i have after the poop: "+books);
    }
}
