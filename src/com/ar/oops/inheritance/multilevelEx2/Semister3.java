package com.ar.oops.inheritance.multilevelEx2;

public class Semister3  extends Semister2{
    int m21,m22,m23,m24,m25,avg3;
    Semister3(){
        m21=98;
        m22=97;
        m23=95;
        m24=97;
        m25=95;
        avg3=(m21+m22+m23+m24+m25)/5;
    }
    int totatavg(){
        return (avg1+avg2+avg3);
    }
}
