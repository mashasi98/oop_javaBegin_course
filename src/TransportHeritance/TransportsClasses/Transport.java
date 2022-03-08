package TransportHeritance.TransportsClasses;

public class Transport {
    private String name;
    private String model;
    private String color;

    public Transport() {
    }

    public Transport(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive(){

        if (name!=null){
            System.out.println("TransportsClasses " +name+" is driving" );
        }else {
            System.out.println("Transport without name is driving" );
        }
    }

    public void stop(){
        if (name!=null){
            System.out.println("TransportsClasses " +name+" is stopping" );
        }else {
            System.out.println("Transport without name is stopping" );
        }

    }


}
