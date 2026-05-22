package com.ar.oops.abstractclass.onlyMethod;

public class Employee extends  Worker{
    void printinfo(){
        String name = "My Employee Name is jerry";
        int age = 28;
        float salary = 666.2F;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

}
