package com.company;

import TransportsClasses.Cars.BMW;
import TransportsClasses.Cars.Car;
import TransportsClasses.MotorBikes.Kawasaki;
import TransportsClasses.MotorBikes.Ural;
import TransportsClasses.Transport;

public class Main {

    public static void main(String[] args) {

        Transport transport = new Transport();
        transport.setName("SomeTransport");
        transport.drive();
        transport.stop();

        Car car = new Car();
        car.setName(" SomeCar");
        car.drive();
        car.stop();
        car.signal();


        BMW bmw = new BMW();
        bmw.setName(" SomeBMW");
        bmw.drive();

        Kawasaki kawasaki = new Kawasaki("GHI-1","1234","blue",3.5,1990);
        kawasaki.jump();

        Ural ural = new Ural("ururur","ural-model","black",4.3,true);
        ural.showInfo();





    }
}
