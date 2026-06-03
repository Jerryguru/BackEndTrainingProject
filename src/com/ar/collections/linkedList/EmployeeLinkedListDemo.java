package com.ar.collections.linkedList;

import java.util.LinkedList;

public class EmployeeLinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> employees =
                new LinkedList<>();

        employees.add("Ramesh");
        employees.add("Suresh");
        employees.add("Mahesh");
        employees.add("Sathesh");
        employees.add("Ithhesh");

        System.out.println("Original : " + employees);

        employees.addFirst("Kiran");

        System.out.println("After addFirst : " + employees);

        employees.addLast("Arjun");

        System.out.println("After addLast : " + employees);
        employees.remove(1);
        System.out.println(employees);
        employees.removeFirst();
        System.out.println(employees);
        employees.removeLast();
        System.out.println(employees);
    }
}