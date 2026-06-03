package com.ar.collections.stack;

import java.util.Stack;

public class AccountBalance {
     public static void main(String[] args) {
         Stack<Integer> balance = new Stack<>();
         balance.push(1000);
         balance.push(200);
         balance.push(100);
         /*System.out.println("Current balance is: "+balance);
         System.out.println("Cancell the last transection: "+balance.pop());*/

         System.out.println("Current Transection: "+ balance);
         Integer cancelledTransection = balance.pop();
         System.out.println("Canselled Transection:"+cancelledTransection);
         System.out.println("Remaining Transection: "+balance);
         System.out.println("****************************************");
         if (!balance.empty()) {

             Integer cancelledTransaction = balance.pop();

             System.out.println(
                     "Cancelled Transaction : "
                             + cancelledTransaction);

         } else {

             System.out.println(
                     "No transactions available");
         }
    }
}
