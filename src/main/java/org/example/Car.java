package org.example;

public class Car {
    private String name;
    private int enginePower;
    private int weight;
    private CarType carType;
    private Engine engine;
    private Wheel wheel;

    public Car(String name, int enginePower, int weight, CarType carType) {
        this.name = name;
        this.enginePower = enginePower;
        this.weight = weight;
        this.wheel = new Wheel();
        this.engine = new Engine();
            }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
