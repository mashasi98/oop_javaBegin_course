package TransportsClasses.Cars;

import TransportsClasses.Transport;

public class Car extends Transport {
    private int number;


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

    public Car(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
