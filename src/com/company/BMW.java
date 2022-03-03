package com.company;

public class BMW extends Car{

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
