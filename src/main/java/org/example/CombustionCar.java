package org.example;

public class CombustionCar extends Car {
    public CombustionCar(String name, int enginePower, int weight, CarType carType) {
        super(name, enginePower, weight, carType);
    }
public void drive (){
        getEngine().engineStart();
        getWheel().steer();
        getEngine().engineStop();
}


    }

