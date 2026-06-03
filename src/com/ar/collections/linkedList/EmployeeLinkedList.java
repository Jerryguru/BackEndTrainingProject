package com.ar.collections.linkedList;

import java.util.LinkedList;

public class EmployeeLinkedList {
   public static void main(String[]args) {
        LinkedList<String> employees = new LinkedList<>();
        employees.add("Guruvaiah");
        employees.add("Paramesh");
        employees.add("Sreekanth");
        employees.add("Sreenath");
        System.out.println(employees);
        employees.addFirst("Indira");
        employees.addLast("Next");
    }
}
