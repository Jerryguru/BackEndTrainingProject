package com.ar.oops.polymorphisam.runTimePolymorphisam.managementSystem;

public class Employee {
   private String employeeName;
  private  double salary;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee(String employeeName , double salary){
      this.employeeName = employeeName;
      this.salary= salary;
  }


  void work(){
      System.out.println("Employee is Working");
  }
}
