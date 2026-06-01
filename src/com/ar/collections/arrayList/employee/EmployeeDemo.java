package com.ar.collections.arrayList.employee;

import java.util.ArrayList;

public class EmployeeDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "jerry", 25000));
        employees.add(new Employee(102, "jerry1", 35000));
        employees.add(new Employee(103, "jerry2", 45000));
        employees.add(new Employee(104, "jerry3", 55000));
        employees.add(new Employee(105, "jerry4", 65000));
        employees.add(new Employee(106, "jerry5", 75000));
        employees.add(new Employee(107, "jerry6", 85000));
        employees.add(new Employee(108, "jerry7", 95000));
        employees.add(new Employee(109, "jerry8", 20000));
        System.out.println(employees);
        System.out.println("*********************************");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println("****************************************");
        int searchID = 105;
        for (Employee emp : employees) {
            Employee highest = null;
            if (emp.id == searchID) {
                System.out.println("Employee Found");
                System.out.println(emp);
                System.out.println("************************************");
                for (Employee emp1 : employees) {
                    if (emp1.salary > 50000) {
                        System.out.println(emp1);
                    }
                    System.out.println("***************************");
                    highest = employees.get(0);
                    for (Employee emp2 : employees) {
                        if (emp2.salary > highest.salary) {
                            highest = emp2;
                        }
                    }
                    System.out.println("Heighest Salary Employees");
                    System.out.println(highest);
                }
            }
            System.out.println("***************************");
            Employee lowest = employees.get(0);
            for (Employee emp2 : employees) {
                if (emp2.salary < lowest.salary) {
                    lowest = emp2;
                }
            }
            System.out.println("Lovest Salary Employees");
            System.out.println(lowest);

        }
        System.out.println("**************************************************");
        double totalSalary = 0;

        for (Employee emp3 : employees) {

            totalSalary += emp3.salary;

        }

        System.out.println("Total Salary = " + totalSalary);


    }

}
