package com.ar.oops.inheritance.multilevelEx2;

public class SemisterAll {

    public static void main(String args[]){
        Semister3 s3=new Semister3();
        System.out.println("Semister1 Average " + s3.avg1);
        System.out.println("Semister2 Average " + s3.avg2);
        System.out.println("Semister3 Average " + s3.avg3);
        System.out.println("**************************");
        System.out.println("total Average " + s3.totatavg());
    }



}
