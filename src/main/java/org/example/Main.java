package org.example;

public class Main {
    static String name;

    public static void main(String[] args) {



    Car ladaVesta = new CombustionCar("Vesta", 1600, 900, CarType.SEDAN);
    Car vwJetta = new CombustionCar("Jetta", 1400, 1200, CarType.VAGON);
    Car tesla = new ElectricCar("Cybertruck", 1500, 1500, CarType.JEEP);


    testCar(ladaVesta);
    testCar(vwJetta);
    testCar(tesla);


}
    public static void testCar(Car car) {
        System.out.println("--------------");
        describeCar(car);
     //   driveCar(car);
        System.out.println("--------------");

    }

    public static void describeCar(Car car){
        System.out.println("Name: " + car.getName() + "\n" +
                "Type: " + car.getCarType() + "\n" +
                "HP: " + car.getEnginePower() + "\n" +
                "Weight: " + car.getWeight());
    }

    public static void driveCar(Driveble driveable){
        driveable.drive();
    }
}
