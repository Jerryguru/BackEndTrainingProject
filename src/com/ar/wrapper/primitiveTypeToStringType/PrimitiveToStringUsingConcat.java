package com.ar.wrapper.primitiveTypeToStringType;

public class PrimitiveToStringUsingConcat {
    public static void main(String[] args) {
        int a = 8686;
        String s1 = a + "";
        System.out.println(s1);

        System.out.println("****************");

        double d = 86.86;
        String s2 = "Double Value : " + d;
        System.out.println(s2);

        System.out.println("****************");

        float f = 86.86f;
        String s3 = "Float Value : " + f;
        System.out.println(s3);

        System.out.println("****************");

        char ch = 'G';
        String s4 = "Character : " + ch;
        System.out.println(s4);

        System.out.println("****************");

        boolean bl = true;
        String s5 = "Status : " + bl;
        System.out.println(s5);
    }
}
