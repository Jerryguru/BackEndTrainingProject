package com.ar.wrapper.stringTypeToPrimitiveType;

public class StringToPrimitiveUsingWrapperMethods {
    public static void main(String[] args) {
        String s1 = "100";
        int a = Integer.valueOf(s1).intValue();
        System.out.println(a);

        System.out.println("****************");

        String s2 = "11.23";
        double d = Double.valueOf(s2).doubleValue();
        System.out.println(d);

        System.out.println("****************");

        String s3 = "12.5";
        float f = Float.valueOf(s3).floatValue();
        System.out.println(f);

        System.out.println("****************");

        String s4 = "99999";
        long l = Long.valueOf(s4).longValue();
        System.out.println(l);

        System.out.println("****************");

        String s5 = "25";
        short sh = Short.valueOf(s5).shortValue();
        System.out.println(sh);

        System.out.println("****************");

        String s6 = "10";
        byte b = Byte.valueOf(s6).byteValue();
        System.out.println(b);

        System.out.println("****************");

        String s7 = "true";
        boolean bl = Boolean.valueOf(s7).booleanValue();
        System.out.println(bl);
    }
}
