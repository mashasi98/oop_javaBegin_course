package Paterns.Factory;

import Paterns.Factory.AirplanesModels.TU154;
import Paterns.Factory.CarsModels.*;
import Paterns.Factory.Enums.PlaneType;
import Paterns.Factory.Enums.RoadType;
import Paterns.Factory.Interfaces.IAirplaneFactory;
import Paterns.Factory.Interfaces.ICarFactory;
import Paterns.Factory.Interfaces.TransportFactory;

public class RussianTransport implements TransportFactory {
    public  static RussianTransport transportIntance;



    private RussianTransport() {
    }

    public static Paterns.Factory.RussianTransport getTransportIntance() {

        if (transportIntance==null){
            transportIntance= new RussianTransport();
        }
        return transportIntance;
    }

    @Override
    public ICarFactory createCar(RoadType roadType) {
        ICarFactory carFactory=null;
        switch (roadType){
            case CYTY :
                carFactory= new Vaz();
                break;
            case OFF_ROAD:
            case GRASS:
                carFactory= new Niva();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + roadType);
        }

        return carFactory;
    }

    @Override
    public IAirplaneFactory createAirplane(PlaneType planeType) {
        IAirplaneFactory airplaneFactory=null;

        switch (planeType){
            case Tu154:
                airplaneFactory= new TU154();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + planeType);
        }

        return airplaneFactory;
    }
}
