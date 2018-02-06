package com.company;

public class Main {

    public static MainMenu mainMenu; //create a static instance of mainMenu that you can access in any class
    public static Vehicle vehicle;

    public static void main(String[] args) {


//        vehicle = new Vehicle();
//        vehicle.chooseVehicle();

        mainMenu = new MainMenu();
        mainMenu.createCar();



    }
}

/*
HW tonight: create class for pre-built car

ideas:
cannot go negative speed, or else change output to "reverse"
make it required to come to a stop to fill tank
big idea: give warning when you need to slow down to refill tank
 */