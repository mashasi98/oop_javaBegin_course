package com.company;

public class Main {

    public static void main(String[] args) {

        Transport transport = new Transport();
        transport.setName("SomeTransport");
        transport.drive();
        transport.stop();

        Car car = new Car();
//        car.setName("SomeCar");
        car.drive();
        car.stop();
        car.signal();

//        Car car1 = (Car) new Transport();
//        car1.setName("SomeParentCar");
//        car1.drive();
        BMW bmw = new BMW();
        bmw.drive();
//        Car bm =  new BMW();
//        bm.drive();



    }
}
