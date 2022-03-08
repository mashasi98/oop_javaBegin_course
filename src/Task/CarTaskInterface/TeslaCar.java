package Task.CarTaskInterface;


public class TeslaCar implements ICar {

    private String name;

    public TeslaCar() {
    }

    public TeslaCar(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(getName()+" drive");
    }

    @Override
    public void stop() {
        System.out.println(getName()+" stop");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
