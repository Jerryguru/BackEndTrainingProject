package com.ar.collections.arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ppp");
        list.add("ttt");
        list.add("yyy");
        list.add("ttt");
        list.add("zzz");
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println(list1);
        System.out.println(list1);
        HashSet<String> hashSet = new HashSet<>(list);
        System.out.println(hashSet);

    }
}
