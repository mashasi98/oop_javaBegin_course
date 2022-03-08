package Paterns.Factory.CarsModels;

public class NewGeep extends Geep {
    public void newGeepFunc(){
        System.out.println("new Geep Func");
    }

    @Override
    public void drive() {
        System.out.println("driving New Geep");
    }
}
