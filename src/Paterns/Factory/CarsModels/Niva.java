package Paterns.Factory.CarsModels;

import Paterns.Factory.Interfaces.ICarFactory;

public class Niva implements ICarFactory {
    @Override
    public void drive() {
        System.out.println("Niva driving");
    }

    @Override
    public void stop() {
        System.out.println("Niva stoping");
    }
}
