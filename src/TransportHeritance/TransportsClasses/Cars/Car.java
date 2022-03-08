package TransportHeritance.TransportsClasses.Cars;

import TransportHeritance.Details.Engine;
import TransportHeritance.TransportsClasses.Transport;

public class Car extends Transport {
    private int number;
    private Engine engine;



    public Car() {
    }

    public Car(String name) {
        super(name);
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car(String name, String model, String color) {
        super(name, model, color);
    }

    public Car(int number,Engine engine) {
        this.number = number;
        this.engine=engine;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        String name =super.getName();
        if (name!=null) {
            System.out.println("Car" + name + " is driving");
        }else {
            System.out.println("Car without name is driving" );
        }
    }

    @Override
    public void stop() {
        String name =super.getName();
        if (name!=null){
            System.out.println("Car"+name+" is stopping" );
        }else {
            System.out.println("Car without name is stopping" );
        }

    }

    public void signal(){
        String name =super.getName();
        if (name!=null) {
            System.out.println("Car" + name + " is signaling");
        }else {
            System.out.println("Car without name is signaling" );
        }

    }
}
