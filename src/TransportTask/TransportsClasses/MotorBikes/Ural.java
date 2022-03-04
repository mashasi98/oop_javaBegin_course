package TransportTask.TransportsClasses.MotorBikes;

public class Ural extends Motorbike{
    private boolean firstAidKit;

    public Ural() {
    }

    public Ural(String name, String model, String color, double volume, boolean firstAidKit) {
        super(name, model, color, volume);
        this.firstAidKit = firstAidKit;
    }

    public Ural(String name) {
        super(name);

    }

    public boolean isFirstAidKit() {
        return firstAidKit;
    }

    public void setFirstAidKit(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    @Override
    public void stop() {
        System.out.println("Ural"+super.getName()+"is stoping");
    }

    @Override
    public void drive() {

        System.out.println("Ural"+super.getName()+"is driving");
    }
    public void showInfo(){
        System.out.println("Information about Ural bike: \n name :"+getName()+"\n volume:"+getVolume()+"\n FirstAidKit:"+isFirstAidKit());
    }
}
