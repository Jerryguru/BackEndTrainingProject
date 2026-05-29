package com.ar.wrapper.stringTypeToPrimitiveType;

public class StringToPrimitiveUsingParseXXXMethod {
    public static void main(String[] args) {
        String s1 = "100";
        int a = Integer.parseInt(s1);
        System.out.println(a);

        System.out.println("****************");

        String s2 = "11.23";
        double d = Double.parseDouble(s2);
        System.out.println(d);

        System.out.println("****************");

        String s3 = "12.5";
        float f = Float.parseFloat(s3);
        System.out.println(f);

        System.out.println("****************");

        String s4 = "99999";
        long l = Long.parseLong(s4);
        System.out.println(l);

        System.out.println("****************");

        String s5 = "25";
        short sh = Short.parseShort(s5);
        System.out.println(sh);

        System.out.println("****************");

        String s6 = "10";
        byte b = Byte.parseByte(s6);
        System.out.println(b);

        System.out.println("****************");

        String s7 = "true";
        boolean bl = Boolean.parseBoolean(s7);
        System.out.println(bl);
    }
}
