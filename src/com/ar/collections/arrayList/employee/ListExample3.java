package com.ar.collections.arrayList.employee;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {
     public static void main(String[]args) {
        List<String> list = new ArrayList<>();
        list.add("ppp");
        list.add("ttt");
        list.add("yyy");
        list.add("ttt");
        list.add("zzz");
        System.out.println(list);
        // fetching an element from third middle
        String middleElement =list.get(list.size()/2);
        System.out.println(middleElement);
    }
}
