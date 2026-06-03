package com.ar.collections.stack;

import java.util.Stack;

public class BrowserHistory {
     public static void main(String[] args) {
         Stack<String> history = new Stack<>();
         history.push("Google");
         history.add("Chrome");
         history.push("FireFox");
         System.out.println("Current Page: "+history.peek());
         System.out.println("Back to: "+history.pop());
         System.out.println("Current stack: "+history);


    }
}
