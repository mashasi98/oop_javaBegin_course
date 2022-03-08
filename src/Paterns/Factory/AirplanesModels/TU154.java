package Paterns.Factory.AirplanesModels;

import Paterns.Factory.Interfaces.IAirplaneFactory;

public class TU154 implements IAirplaneFactory {
    @Override
    public void fly() {
        System.out.println("TU154 fly ");
    }
}
