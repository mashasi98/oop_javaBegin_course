package Paterns.Factory.Interfaces;

import Paterns.Factory.Enums.PlaneType;
import Paterns.Factory.Enums.RoadType;

public interface TransportFactory {

    ICarFactory createCar(RoadType roadType);
    IAirplaneFactory createAirplane(PlaneType planeType);
}
