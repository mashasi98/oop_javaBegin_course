package RobotTaskAbstractInterface;

public class Robokop extends ARobot {

    public Robokop(String name, IWing wing) {
        super(name, wing);
    }

    public Robokop() {
    }

//    @Override
//    public void move() {
//        System.out.println("Robokop is moving");
//    }

    @Override
    public void stop() {
        System.out.println("Robokop is stoping");
    }

    @Override
    public void fly() {
        getWing().open();
        System.out.println("Robokop is flying with wings " + getWing().getSize());
    }

    @Override
    public void talk() {
        System.out.println("Robokop is talking");
    }

    @Override
    public IWing getWing() {
        return super.getWing();
    }

    public void takeGun(){
        System.out.println(" robocop take gun");
    }
}