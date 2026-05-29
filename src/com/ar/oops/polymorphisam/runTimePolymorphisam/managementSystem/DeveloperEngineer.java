package com.ar.oops.polymorphisam.runTimePolymorphisam.managementSystem;

public class DeveloperEngineer extends Employee{
    String technoligy;

    public String getTechnoligy() {
        return technoligy;
    }

    public void setTechnoligy(String technoligy) {
        this.technoligy = technoligy;
    }

    DeveloperEngineer(String employeeName, double salary , String technoligy){
        super(employeeName,salary);
        this.technoligy= technoligy;
    }
@Override
        void work(){
    System.out.println(getEmployeeName() +" is Developing the code "+ technoligy);
        }
        void displayDetails(){
            System.out.println("Employee name: "+getEmployeeName());
            System.out.println("Employee Salary: "+ getSalary());
            System.out.println("Employee technilogy is: "+getTechnoligy());
        }

}
