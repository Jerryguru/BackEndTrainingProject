package com.ar.oops.interfase.example2;

public class Bycycle implements Vehical{
    int speed;
    int gear;

    @Override
    public void changeGear(int changeGear) {
        gear=changeGear;

    }

    @Override
    public void speedUp(int increment) {
speed= speed+increment ;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed=speed-decrement;

    }
    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }

}
