package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

public class Car extends Vehicle {

    private int speed = 0;
    private int gas = 100;
    private Scanner input = new Scanner(System.in);

    public Car() { //only has one constructor (default constructor - parameters are blank)

        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGas(100);
    }

    public Car(int year, String make, String model, int speed, int gas) {
        super(year, make, model); //gets values/variables from parent class
        this.speed = speed;
        this.gas = gas;
    }

    public void setYear() {
        System.out.println("What is the year of the car you are building? ");
        try {
            super.setYear(input.nextInt());
        } catch (InputMismatchException ime) {
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

    public void getCarInfo() {

        System.out.println("Your current car is a " + getYear() + " " + getMake() + " " + getModel() + ". It is going "
                + getSpeed() + " MPH and has " + getGas() + "% of its gas left.");

    }


    public void driveCar(Car car) { //require that method take the car object bc we need to see the speed of the car before we do anything with it.

        for (int seconds = 0; seconds <= 5; seconds++) {
            if (car.getSpeed() <= 120) {
                car.setSpeed(car.getSpeed() + 2);
                car.setGas(car.getGas() - 2);
            }
            if (car.getSpeed() >= 120) {
                car.setSpeed(120);
                System.out.println("Your " + getModel() + " has topped out at 160. Please decelerate.");
                break;
            }
            if ((car.getGas()) <= 0) {
                car.setSpeed(0);
                car.setGas(getGas());
                System.out.println("You've run out of gas!");
                break;
            }

            System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + car.getSpeed() + " MPH and has "
                    + car.getGas() + "% of its gas left.");
        }

        mainMenu.customMenu(car);
    }

    public void slowCar(Car car) {

        for (int seconds = 0; seconds <= 5; seconds++) {

            if ((car.getSpeed() <= 120) && (car.getSpeed()) >= 1) {
                car.setSpeed(car.getSpeed() - 1);
                car.setGas(car.getGas() - 1);
            }
            if ((car.getGas()) <= 0) {
                car.setSpeed(0);
                car.setGas(getGas());
                System.out.println("You've run out of gas!");
                break;
            } else if ((car.getGas()) >= 5) {
                car.setGas(car.getGas());
            } else if (car.getSpeed() < 6) {
                car.setSpeed(0);
            }

            System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + car.getSpeed() + " MPH and has "
                    + car.getGas() + "% of its gas left.");
        }

        mainMenu.customMenu(car);
    }

    public void addGas(Car car) {

        car.setGas(100);

        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " now has a full tank of gas!");
        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + car.getSpeed() + " MPH and has "
                + car.getGas() + "% of its gas left.");

        mainMenu.customMenu(car);
    }
}
