package com.ar.clonable.example1;

public class Car  implements Cloneable{
    private final int id;
    private String make;
    private int doors;
    GearBox gearBox;
    Engine engine;

    public Car(int id, String make, int doors) {
        this.id = id;
        this.make = make;
        this.doors = doors;

    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
public int getGears(){
       return gearBox.getGears();
}
public void setGears (int n){
        gearBox.setGears(n);

}
    public int getCylinders(){
        return engine.getCylinders();
    }
    public void setCylinders(int n){
        engine.setCylinders(n);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
