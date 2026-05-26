package com.ar.wrapper.primitiveToObject.boxing;

public class Home {
    public static void main(String[] args) {
        int num=106;
        Integer obj = new Integer((num));//new Integer(value) is deprecated from Java 9.
        System.out.println(num);
        System.out.println(obj);
    }
}
