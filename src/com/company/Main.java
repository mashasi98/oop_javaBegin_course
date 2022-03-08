package com.company;

import CarTaskInterface.TeslaCar;
import ComputerTask.Computer;
import ComputerTask.Monitor;
import RobotTaskAbstractInterface.AirplaneWing;
import RobotTaskAbstractInterface.LittleWing;
import RobotTaskAbstractInterface.Robokop;
import TaskPrinter.Printer;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        AirplaneWing airplaneWing = new AirplaneWing(200);
        airplaneWing.open();
        LittleWing littleWing =  new LittleWing(20);

//
        Robokop robokop = new Robokop("roboMe", airplaneWing);
//
        robokop.setWing(airplaneWing);
        System.out.println(robokop.getWing().getSize());
        robokop.move();
        robokop.fly();
        robokop.setWing(littleWing);
        robokop.fly();
        someMetod(String.valueOf(robokop.getWing().getSize()));
        Set ыуе = new HashSet();
//
//        TeslaCar teslaCar = new TeslaCar("Tesla");
//        teslaCar.drive();
//        teslaCar.stop();
//
//        Monitor monitor = new Monitor("Samsung");
//        Computer computer = new Computer("MacBook", monitor);
//
//
//        computer.on();
//        computer.off();

//        Printer printer = new Printer(10);
//
//        printer.print("Hello world");
//        printer.charge(5);
//        printer.print("Hello world");


    }

    public static void someMetod(String s){
        System.out.println(s);
    }
}
