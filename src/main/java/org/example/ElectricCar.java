package org.example;

public class ElectricCar extends Car{
    public ElectricCar(String name, int enginePower, int weight, CarType carType) {
        super(name, enginePower, weight, carType);
    }

    public void drive(){
        getWheel().steer();
    }
}
