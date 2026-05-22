package com.ar.oops.abstractclass.mainAbstract;

public class Developer extends Employee{
    int salary;
    int bonus;

    public Developer(int employeeid, String name, int salary, int bonus) {
        super(employeeid, name);
        this.salary = salary;
        this.bonus = bonus;
    }
// this is a abstract method
    @Override
    void calculateSalary() { int totalSalary = salary+bonus;
        System.out.println("Base Salary is: "+salary);
        System.out.println("Here the Bonus was: "+bonus);
        System.out.println("Here the TotalSalary was: "+totalSalary);

    }
}
