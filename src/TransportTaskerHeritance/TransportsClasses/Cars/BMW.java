package TransportTaskerHeritance.TransportsClasses.Cars;



public class BMW extends Car {
    public BMW() {

    }

    public BMW(String name, String model, String color) {
        super(name, model, color);
    }

    @Override
    public void drive() {
        String name =super.getName();
        if (name!=null) {
            System.out.println("BMW" + super.getName() + " is driving");
        }else {
            System.out.println("BMW without name is driving" );
        }
    }

}
