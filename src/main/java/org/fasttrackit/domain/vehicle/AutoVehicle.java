package org.fasttrackit.domain.vehicle;

public abstract class AutoVehicle extends Vehicle {


    private Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
