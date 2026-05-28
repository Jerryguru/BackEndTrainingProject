package com.ar.wrapper.objectToString;

public class ObjectToStringUsingValueOf {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);
        String s1 = String.valueOf(i);
        System.out.println(s1);

        System.out.println("****************");

        Double d = Double.valueOf(11.23);
        String s2 = String.valueOf(d);
        System.out.println(s2);

        System.out.println("****************");

        Float f = Float.valueOf(12.5f);
        String s3 = String.valueOf(f);
        System.out.println(s3);

        System.out.println("****************");

        Character ch = Character.valueOf('J');
        String s4 = String.valueOf(ch);
        System.out.println(s4);

        System.out.println("****************");

        Boolean bl = Boolean.valueOf(true);
        String s5 = String.valueOf(bl);
        System.out.println(s5);


}
}
