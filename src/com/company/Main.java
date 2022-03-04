package com.company;

import RobotTask.AirplaneWing;
import RobotTask.IWing;
import RobotTask.Robokop;
import RobotTask.Terminator;
import TransportTask.TransportsClasses.MotorBikes.Kawasaki;
import TransportTask.TransportsClasses.MotorBikes.Motorbike;

public class Main {

    public static void main(String[] args) {

        AirplaneWing airplaneWing = new AirplaneWing(200);
        airplaneWing.open();

        Robokop robokop = new Robokop("roboMe", airplaneWing);

        robokop.setWing(airplaneWing);
        System.out.println(robokop.getWing().getSize());
        robokop.move();
        robokop.fly();





    }
}
