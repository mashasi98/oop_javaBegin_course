package Paterns.Factory.AirplanesModels;

import Paterns.Factory.Interfaces.IAirplaneFactory;

public class Boeng implements IAirplaneFactory {
    @Override
    public void fly() {
        System.out.println("Boeng fly");
    }
}
