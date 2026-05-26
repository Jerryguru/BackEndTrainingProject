package com.ar.clonable.example1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
Car car = new Car(1,"BMW",4);
GearBox gearBox = new GearBox(4);
Engine engine = new Engine(6);
car.setGearBox(gearBox);
car.setEngine(engine);
        System.out.println("Make: "+car.getMake());
        System.out.println("Doors: "+car.getDoors());
        System.out.println("Gears: "+car.getGears());
        System.out.println("Cylinders: "+car.getCylinders());




Car obj = (Car)car.clone();
car.setGears(5);
car.setCylinders(7);
        System.out.println("********************************");
        System.out.println("Make: "+obj.getMake());
        System.out.println("Doors: "+obj.getDoors());
        System.out.println("Gears: "+obj.getGears());
        System.out.println("Cylinders: "+obj.getCylinders());
    }
}
