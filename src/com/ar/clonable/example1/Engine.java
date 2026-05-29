package com.ar.clonable.example1;

public class Engine {
   private int cylinder ;

    public Engine(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getCylinders() {
        return cylinder;
    }

    public void setCylinders(int cylinder) {
        this.cylinder = cylinder;
    }
}
