package RobotTask;

public class Terminator extends ARobot{
    public Terminator(String name, IWing wing) {
        super(name, wing);
    }

    public Terminator() {
    }

    @Override
    public void move() {
        System.out.println("Terminator is moving");
    }

    @Override
    public void stop() {
        System.out.println("Terminator is stoping");
    }

    @Override
    public void fly() {
        System.out.println("Terminator is flying");
    }

    @Override
    public void talk() {
        System.out.println("Terminator is talking");
    }

    @Override
    public IWing getWing() {
        return null;
    }

}
