package Paterns.Factory.CarsModels;

import Paterns.Factory.Interfaces.ICarFactory;

public class Geep implements ICarFactory {
    @Override
    public void drive() {
        System.out.println("driving geep");
    }

    @Override
    public void stop() {
        System.out.println("stoping geep");
    }
}
