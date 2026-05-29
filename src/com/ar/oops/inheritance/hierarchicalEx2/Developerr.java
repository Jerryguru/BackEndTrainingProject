package com.ar.oops.inheritance.hierarchicalEx2;

public class Developerr extends Companyy {
   private String developername;
    Developerr(String Companyname , String location , String developername){
        super(Companyname,location);
        this.developername= developername;

    }
    void coding (){
        System.out.println(developername + "is writting a java code");
    }
}
