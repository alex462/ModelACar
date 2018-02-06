package com.company;

import java.util.Scanner;

import static com.company.Main.vehicle;

public class PrebuiltOne extends Vehicle {

    private int speed = 0;
    private int gas = 100;
    private Scanner input = new Scanner(System.in);

    public PrebuiltOne() {

        setMake("a'Lexis");
        setModel("Hambourghini");
        setYear(2012);
        setSpeed(0);
        setGas(100);
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void getCarInfo(){

        System.out.println("Your current car is a " + getYear() + " " + getMake() + " " + getModel() + ". It is going "
                + getSpeed() + " MPH and has " + getGas() + "% of its gas left.");

    }

    public void driveCar(Car car){ //require that method take the car object bc we need to see the speed of the car before we do anything with it.

        for(int seconds = 0; seconds <= 5; seconds++){
            //get current gas and speed
            car.setSpeed(car.getSpeed() + 1); //will add 1mph every time it loops
            car.setGas(car.getGas() - 2); //will take away 1(%) of gas tank each time it loops

            System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + car.getSpeed() + " MPH and has "
                    + car.getGas() + "% of its gas left.");
        }

        vehicle.chooseVehicle();
    }

    public void slowDown(Car car){

        for(int seconds = 0; seconds <= 5; seconds++){
            //get current gas and speed
            car.setSpeed(car.getSpeed() - 1); //will add 1mph every time it loops
            car.setGas(car.getGas() - 1); //will take away 1(%) of gas tank each time it loops

//            try{
//
//            }

            System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + car.getSpeed() + " MPH and has "
                    + car.getGas() + "% of its gas left.");
        }

        vehicle.chooseVehicle();
    }

    public void addGas(Car car){

        car.setGas(100);

        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " now has a full tank of gas!");
        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + car.getSpeed() + " MPH and has "
                + car.getGas() + "% of its gas left.");

        vehicle.chooseVehicle();
    }
}

