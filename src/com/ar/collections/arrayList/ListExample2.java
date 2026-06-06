package com.ar.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ppp");
        list.add("ttt");
        list.add("yyy");
        list.add("ttt");
        list.add("zzz");
        System.out.println(list);
        System.out.println(list.get(3));
        list.add("mmm");
        System.out.println(list);
        list.add("Paramesh");
        System.out.println(list);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
}
}
