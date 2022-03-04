package RobotTaskAbstractInterface;

public abstract class ARobot implements IRobot {

    private String name;
    private IWing wing;

    @Override
    public IWing getWing() {
        return wing;
    }

    public void setWing(IWing wing) {
        this.wing = wing;
    }

    public ARobot(String name, IWing wing) {
        this.name = name;
        this.wing = wing;
    }

    public ARobot() {
    }

    public ARobot(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
