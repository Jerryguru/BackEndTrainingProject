package com.ar.wrapper.primitiveTypeToStringType;

public class PrimitiveToString {
    public static void main(String[] args) {
        int a = 8686;
        String s1 = String.valueOf(a);
        System.out.println(s1);

        System.out.println("****************");

        double d = 86.86;
        String s2 = String.valueOf(d);
        System.out.println(s2);

        System.out.println("****************");

        float f = 86.86f;
        String s3 = String.valueOf(f);
        System.out.println(s3);

        System.out.println("****************");

        long l = 868699;
        String s4 = String.valueOf(l);
        System.out.println(s4);

        System.out.println("****************");

        short sh = 86;
        String s5 = String.valueOf(sh);
        System.out.println(s5);

        System.out.println("****************");

        byte b = 86;
        String s6 = String.valueOf(b);
        System.out.println(s6);

        System.out.println("****************");

        char ch = 'G';
        String s7 = String.valueOf(ch);
        System.out.println(s7);

        System.out.println("****************");

        boolean bl = true;
        String s8 = String.valueOf(bl);
        System.out.println(s8);
    }
}
