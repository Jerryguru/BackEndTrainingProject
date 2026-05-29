package com.ar.oops.inheritance.hierarchicalEx2;

public class Tester extends Companyy{
   private String testername;
    Tester (String Companyname , String location , String testername ){
        super(Companyname,location);
        this.testername= testername;


    }
    void testing(){
        System.out.println(testername +"is testing the java appliction");
    }
}
