package com.ar.wrapper.objectToPrimitive;

public class AutoUnBoxing {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(8686);
        int a = obj; // Auto Unboxing
        System.out.println(a);

        System.out.println("****************");

        Double obj1 = Double.valueOf(86.86);
        double a1 = obj1; // Auto Unboxing
        System.out.println(a1);

        System.out.println("****************");

        Float obj2 = Float.valueOf(86.86f);
        float a2 = obj2; // Auto Unboxing
        System.out.println(a2);

        System.out.println("****************");

        Character obj3 = Character.valueOf('P');
        char a3 = obj3; // Auto Unboxing
        System.out.println(a3);

        System.out.println("****************");

        Boolean obj4 = Boolean.valueOf(false);
        boolean a4 = obj4; // Auto Unboxing
        System.out.println(a4);
    }

}
