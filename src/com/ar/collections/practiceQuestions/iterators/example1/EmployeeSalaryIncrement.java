package com.ar.collections.practiceQuestions.iterators.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeSalaryIncrement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Paramesh", 40000));
        employees.add(new Employee(102, "Sreekanth",60000));
        employees.add(new Employee(103, "Mahesh",   70000));
        employees.add(new Employee(104, "Sreenath", 45000));
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            if (emp.getSalary() > 50000) {
                double incrementSalary = emp.getSalary() + (emp.getSalary() * 10 / 100);
                emp.setSalary(incrementSalary);
            }
        }
        System.out.println("After Incremant");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
