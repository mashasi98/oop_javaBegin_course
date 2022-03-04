package RobotTaskAbstractInterface;

public interface IRobot {


    default void move() {
        System.out.println("move robot " + getName());
    }

    void stop();

    void fly();

    void talk();

    String getName();

    IWing getWing();

}
