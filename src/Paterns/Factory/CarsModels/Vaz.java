package Paterns.Factory.CarsModels;

import Paterns.Factory.Interfaces.ICarFactory;

public class Vaz implements ICarFactory {
    @Override
    public void drive() {
        System.out.println("Vaz driving");
    }

    @Override
    public void stop() {
        System.out.println("Vaz stoping");
    }
}
