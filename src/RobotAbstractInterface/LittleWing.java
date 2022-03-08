package RobotAbstractInterface;

public class LittleWing implements IWing{
    public LittleWing(int wingSize) {
        this.wingSize = wingSize;
    }

    private int wingSize;

    @Override
    public void open() {
        System.out.println("little wing open");
    }

    @Override
    public int getSize() {
        return wingSize;
    }
}
