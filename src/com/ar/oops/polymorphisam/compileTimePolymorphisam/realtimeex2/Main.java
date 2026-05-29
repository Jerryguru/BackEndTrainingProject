package com.ar.oops.polymorphisam.compileTimePolymorphisam.realtimeex2;

public class Main {
   public static void main(String[] args) {
       Employee e1 = new Employee();
       e1.setEmployee("Jerry Paramesh");
       System.out.println(e1.getEmployeename());
       Employee e2 =new Employee();
       e2.setEmployee("Guru" ,87654);
       System.out.println(e2.getEmployeename());
       System.out.println(e2.getSalary());
       Employee e3 = new Employee();
       e3.setEmployee("jerry",87656,"google");
       System.out.println(e3.getEmployeename());
       System.out.println(e3.getSalary());
       System.out.println(e3.getCompany());


    }
}
