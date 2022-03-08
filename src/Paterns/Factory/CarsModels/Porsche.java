package Paterns.Factory.CarsModels;

import Paterns.Factory.Interfaces.ICarFactory;

public class Porsche implements ICarFactory {
    @Override
    public void drive() {
        System.out.println("driving Porsche");
    }

    @Override
    public void stop() {
        System.out.println("stoping Porsche");
    }
}
