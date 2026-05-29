package com.ar.oops.polymorphisam.compileTimePolymorphisam.realtimeex2;

public class Employee {
    private  String employeename ;
    private double salary ;
    private  String company;
    public void setEmployee(String employeename){
        this.employeename= employeename;
    }
public void setEmployee( String employeename, double salary){
        this.employeename = employeename;
        this.salary= salary;}
    public void setEmployee(String employeename , double salary , String company){
        this.employeename = employeename;
        this.salary= salary;
        this.company = company;
}

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }




}
