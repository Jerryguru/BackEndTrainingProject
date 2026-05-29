package com.ar.oops.abstractclass.partialabstract;

public class Test {
     public static void main(String[] args) {
         //Runtime poymoprphisam parent refers ----> child
Shape s1 = new Rectangle("blue", 10,5);
s1.display();
         System.out.println(" The Area of the Rectangle was : "+s1.area());
    }
}
