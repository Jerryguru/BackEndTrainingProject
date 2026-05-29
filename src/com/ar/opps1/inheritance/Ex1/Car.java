package com.ar.opps1.inheritance.Ex1;

public class Car extends Vehical {
  private   String bodystyle;

    public String getBodystyle() {
        return bodystyle;
    }

    public void setBodystyle(String bodystyle) {
        this.bodystyle = bodystyle;
    }

    public Car(String make, String colour , int year , String model , String bodystyle){
      super(make,colour,year,model);
      this.bodystyle= bodystyle;

  }
  public void cardetails(){
        printdetails();
      System.out.println("Body Style: "+bodystyle);

  }
}
