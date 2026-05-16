package com.ar.opps1.encapsulations;

public class ExampleMain {
    public static void main(String[] args) {
        ExampleHome eh = new ExampleHome();

        eh.setPlace("Kadapa1");
        eh.setHouseAdress("Near Om Shanthi nilayam");
        eh.setHouseMembers(5);
        eh.setTown("Prodatur");
        System.out.println(eh.getHouseAdress());
        System.out.println(eh.getHouseMembers());
        System.out.println(eh.getPlace());
        System.out.println(eh.getTown());
        eh.AdressofHouse();
        eh.TownArea();
        eh.MembersofPeople();
        eh.PlaceArea();
    }
}
