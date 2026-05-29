package com.ar.oops.interfase.example2;

 class Main {
   public static void main(String[] args) {
       // Instance of Bicycle(Object)
       Bycycle bicycle = new Bycycle();

       bicycle.changeGear(2);
       bicycle.speedUp(3);
       bicycle.applyBrakes(1);

       System.out.print("Bicycle present state : ");
       bicycle.printStates();

       // Instance of Bike (Object)
       Bike bike = new Bike();
       bike.changeGear(1);
       bike.speedUp(4);
       bike.applyBrakes(3);

       System.out.print("Bike present state : ");
       bike.printStates();
    }
}
