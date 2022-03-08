package RobotAbstractInterface;

public class AirplaneWing implements IWing {

    private int size;

    public AirplaneWing(int size) {
        this.size = size;
    }

    @Override
    public void open() {
        System.out.println("wing open");
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
