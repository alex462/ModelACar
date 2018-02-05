package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

public class Car extends Vehicle {

    private int speed = 0;
    private int gas = 100;
    private Scanner input = new Scanner(System.in);

    public Car() {

        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGas(100);
    }

    public void setYear() {
        System.out.println("What is the year of the car you are building? ");
        try{
            super.setYear(input.nextInt());
        }catch(InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter a number for the year of the car you are building: ");
            setYear();
        }
    }

    public void setMake() {
        System.out.println("What is the make of the car you are building? ");
        super.setMake(input.nextLine());
    }

    public void setModel() {
        System.out.println("What is the model of the car you are building? ");
        super.setModel(input.nextLine());
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

        mainMenu.menu(car);
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

        mainMenu.menu(car);
    }

    public void addGas(Car car){

        car.setGas(100);

        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " now has a full tank of gas!");
        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + car.getSpeed() + " MPH and has "
                + car.getGas() + "% of its gas left.");

        mainMenu.menu(car);
    }
}
