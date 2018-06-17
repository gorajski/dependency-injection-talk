package com.vehicles;

public class Car {

    private String color;
    private Engine engine;
    private Geartrain geartrain;

    public Car(Color color, Engine engine, Geartrain geartrain) {
        this.color = color;
        this.engine = engine;
        this.geartrain = geartrain;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Geartrain getGeartrain() {
        return geartrain;
    }

    public void setGeartrain(Geartrain geartrain) {
        this.geartrain = geartrain;
    }
}