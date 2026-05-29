package com.ar.wrapper.stringTypeToObject.stringConstructor;

public class StringToObject {
    public static void main(String[] args) {
        String str1 = "100";
        Integer result1 = Integer.valueOf(str1);
        System.out.println(str1);
        System.out.println(result1);

        System.out.println("****************");

        String str2 = "11.23";
        Double result2 = Double.valueOf(str2);
        System.out.println(str2);
        System.out.println(result2);

        System.out.println("****************");

        String str3 = "12.5";
        Float result3 = Float.valueOf(str3);
        System.out.println(str3);
        System.out.println(result3);

        System.out.println("****************");

        String str4 = "99999";
        Long result4 = Long.valueOf(str4);
        System.out.println(str4);
        System.out.println(result4);

        System.out.println("****************");

        String str5 = "25";
        Short result5 = Short.valueOf(str5);
        System.out.println(str5);
        System.out.println(result5);

        System.out.println("****************");

        String str6 = "10";
        Byte result6 = Byte.valueOf(str6);
        System.out.println(str6);
        System.out.println(result6);

        System.out.println("****************");

        String str7 = "true";
        Boolean result7 = Boolean.valueOf(str7);
        System.out.println(str7);
        System.out.println(result7);
    }


}
