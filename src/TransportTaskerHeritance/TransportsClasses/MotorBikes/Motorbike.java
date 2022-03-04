package TransportTaskerHeritance.TransportsClasses.MotorBikes;

import TransportTaskerHeritance.TransportsClasses.Transport;

public class Motorbike extends Transport {
    private double volume;
    public final static int weelCount=4;


    public Motorbike() {
    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        this.volume = volume;
    }

    public Motorbike(String name) {
        super(name);
    }

    public Motorbike(double volume) {
        this.volume = volume;

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void drive() {
        System.out.println("Motorbike"+getName()+"is driving");
    }

    @Override
    public void stop() {
        System.out.println("Motorbike"+getName()+"is stoping");
    }
}
