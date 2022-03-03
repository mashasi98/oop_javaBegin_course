package com.company;

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
        System.out.println("Transport "+this.name+" id driving ");
    }

    public void stop(){
        System.out.println("Transport "+name+" id stoping ");
    }
}
