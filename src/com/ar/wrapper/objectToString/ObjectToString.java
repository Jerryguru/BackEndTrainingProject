package com.ar.wrapper.objectToString;
// toString Method
public class ObjectToString {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(100);
        String s1 = i.toString();
        System.out.println(s1);

        System.out.println("****************");
Double d = Double.valueOf(11.23);

        String s2 = d.toString();
        System.out.println(s2);

        System.out.println("****************");

        Float f = Float.valueOf(12.5f);
        String s3 = f.toString();
        System.out.println(s3);

        System.out.println("****************");

        Long l = Long.valueOf(99999);
        String s4 = l.toString();
        System.out.println(s4);

        System.out.println("****************");

        Short sh = Short.valueOf((short)25);
        String s5 = sh.toString();
        System.out.println(s5);

        System.out.println("****************");

        Byte b = Byte.valueOf((byte)10);
        String s6 = b.toString();
        System.out.println(s6);

        System.out.println("****************");

        Character ch = Character.valueOf('A');
        String s7 = ch.toString();
        System.out.println(s7);

        System.out.println("****************");

        Boolean bl = Boolean.valueOf(true);
        String s8 = bl.toString();
        System.out.println(s8);

    }
}
