package com.company;

import CarTaskInterface.TeslaCar;
import ComputerTask.Computer;
import ComputerTask.Monitor;
import RobotTaskAbstractInterface.AirplaneWing;
import RobotTaskAbstractInterface.Robokop;

public class Main {

    public static void main(String[] args) {

//        AirplaneWing airplaneWing = new AirplaneWing(200);
//        airplaneWing.open();
//
//        Robokop robokop = new Robokop("roboMe", airplaneWing);
//
//        robokop.setWing(airplaneWing);
//        System.out.println(robokop.getWing().getSize());
//        robokop.move();
//        robokop.fly();
//
//        TeslaCar teslaCar = new TeslaCar("Tesla");
//        teslaCar.drive();
//        teslaCar.stop();

        Monitor monitor = new Monitor("Samsung");
        Computer computer = new Computer("MacBook", monitor);


        computer.on();
        computer.off();


    }
}
