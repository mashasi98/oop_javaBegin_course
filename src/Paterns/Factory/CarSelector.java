package Paterns.Factory;


import Paterns.Factory.AirplanesModels.Boeng;
import Paterns.Factory.AirplanesModels.TU154;
import Paterns.Factory.CarsModels.Geep;
import Paterns.Factory.CarsModels.NewGeep;
import Paterns.Factory.CarsModels.Porsche;
import Paterns.Factory.Enums.PlaneType;
import Paterns.Factory.Enums.RoadType;
import Paterns.Factory.Interfaces.IAirplaneFactory;
import Paterns.Factory.Interfaces.ICarFactory;
import Paterns.Factory.Interfaces.TransportFactory;

public class CarSelector implements TransportFactory {
    public static CarSelector intanseFactory;

    private CarSelector() {
    }

    public static CarSelector getIntanseFactory(){
        if( intanseFactory==null){
            intanseFactory = new CarSelector();
        }

        return intanseFactory;
    }
    @Override

    public ICarFactory createCar(RoadType roadType) {
        ICarFactory carFactory=null;
        switch (roadType){
            case CYTY :
                carFactory= new Porsche();
                break;
            case OFF_ROAD:
                carFactory= new Geep();
                break;
            case GRASS:
                carFactory= new NewGeep();
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
            case BOENG757:
                airplaneFactory= new Boeng();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + planeType);
        }

        return airplaneFactory;
    }
}
