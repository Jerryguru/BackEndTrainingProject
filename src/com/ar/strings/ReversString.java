package com.ar.strings;

public class ReversString {
    public static void main(String[] args) {
        String str = "hello";
        //Approch 1
        String rst = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rst = ch + rst;
        }
        System.out.println("Revers String of the Word is = " + rst);

        //Approch 2

        String str1 = "hello";
        char[] charr = str.toCharArray();
        for (int i = charr.length - 1; i >= 0; i--) {
            System.out.println(charr[i]);

        }
        //approch 3
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
        //Approch 4
        StringBuffer str2 = new StringBuffer(str);
        System.out.println(str2.reverse());

        //Approch 5
        StringBuilder str3 = new StringBuilder(str);
        System.out.println(str3.reverse());
    }
    }
