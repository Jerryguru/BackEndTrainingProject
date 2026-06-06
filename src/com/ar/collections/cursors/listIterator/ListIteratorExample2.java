package com.ar.collections.cursors.listIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorExample2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(8);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            Integer num = itr.next();
            if(num== 3){
                itr.remove();
            }
        }
        System.out.println(list);

    }
}