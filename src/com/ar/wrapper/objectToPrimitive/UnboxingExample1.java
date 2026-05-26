package com.ar.wrapper.objectToPrimitive;

public class UnboxingExample1 {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(250);
        int a = obj.intValue();
        System.out.println(a);

        System.out.println("****************");

         Double obj1 = Double.valueOf(11.23);
         double a1 =obj1.doubleValue();
        System.out.println(a1);

        System.out.println("****************");

        Float obj2 = Float.valueOf(11.2f);
        float a2 =obj2.floatValue();
        System.out.println(a2);

        System.out.println("****************");

        Character obj3 = Character.valueOf('j');
        double a3 =obj3.charValue();
        System.out.println(a3);

        System.out.println("****************");

        Boolean obj4 = Boolean.valueOf(true);
        boolean a4 =obj4.booleanValue();
        System.out.println(a4);


    }
}
