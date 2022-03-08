package TransportHeritance.TransportsClasses.MotorBikes;

public class Kawasaki extends Motorbike{

    private int year;

    public Kawasaki() {
    }

    public Kawasaki(String name, String model, String color, double volume, int year) {
        super(name, model, color, volume);
        this.year = year;
    }

    public Kawasaki(String name) {
        super(name);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void drive() {
        System.out.println("Kawasaki"+getName()+"is driving");
    }

    @Override
    public void stop() {
        System.out.println("Kawasaki"+getName()+"is stoping");
    }

    public void jump(){
        System.out.println("Kawasaki"+getName()+"is jumping");
    }
}
