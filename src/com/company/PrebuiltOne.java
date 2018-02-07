package com.company;

import java.util.Scanner;

import static com.company.Main.mainMenu;
import static com.company.Main.vehicle;

//HAMBOURGHINI
public class PrebuiltOne extends Car {
    //add other constructors like color
    private String color;
    private int speed = 0;
    private int gas = 100;
    private Scanner input = new Scanner(System.in);

//    public PrebuiltOne() {
//
//        setMake("a'Lexis");
//        setModel("Hambourghini");
//        setYear(2012);
//        setSpeed(0);
//        setGas(100);
//    }


    public PrebuiltOne(int year, String make, String model, int speed, int gas, String color) {
        super(year, make, model, speed, gas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    protected void getPrebuiltOneInfo() {
        System.out.println("Your current car is a " + getColor() + " " + getYear() + " " + getMake() + " " + getModel() + ". It is going "
                + getSpeed() + " MPH and has " + getGas() + "% of its gas left.");
    }

    public void drivePrebuiltOne(PrebuiltOne prebuiltOne) { //require that method take the car object bc we need to see the speed of the car before we do anything with it.

        for (int seconds = 0; seconds <= 5; seconds++) {
            if (prebuiltOne.getSpeed() <= 100) {
                prebuiltOne.setSpeed(prebuiltOne.getSpeed() + 1);
                prebuiltOne.setGas(prebuiltOne.getGas() - 2);
            }
            if (prebuiltOne.getSpeed() >= 100) {
                prebuiltOne.setSpeed(100);
                System.out.println("Your Hambourghini has topped out at 100. Please decelerate.");
                break;
            }
            if ((prebuiltOne.getGas()) <= 0) {
                prebuiltOne.setSpeed(0);
                prebuiltOne.setGas(getGas());
                System.out.println("You've run out of gas!");
                break;
            }

            System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + prebuiltOne.getSpeed() + " MPH and has "
                    + prebuiltOne.getGas() + "% of its gas left.");
        }

        mainMenu.hamboMenu(prebuiltOne);
    }

    public void slowPrebuiltOne(PrebuiltOne prebuiltOne) {

        for (int seconds = 0; seconds <= 5; seconds++) {
            if ((prebuiltOne.getSpeed() <= 100) && (prebuiltOne.getSpeed()) >= 1) {
                prebuiltOne.setSpeed(prebuiltOne.getSpeed() - 1);
                prebuiltOne.setGas(prebuiltOne.getGas() - 2);
            }
            if ((prebuiltOne.getGas()) <= 0) {
                prebuiltOne.setSpeed(0);
                prebuiltOne.setGas(getGas());
                System.out.println("You've run out of gas!");
                break;
            } else if ((prebuiltOne.getGas()) >= 5) {
                prebuiltOne.setGas(prebuiltOne.getGas());
            } else if (prebuiltOne.getSpeed() < 6) {
                prebuiltOne.setSpeed(0);
            }
            System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + prebuiltOne.getSpeed() + " MPH and has "
                    + prebuiltOne.getGas() + "% of its gas left.");
        }

        mainMenu.hamboMenu(prebuiltOne);
    }

    public void addGas(PrebuiltOne prebuiltOne) {

        prebuiltOne.setGas(100);

        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " now has a full tank of gas!");
        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + prebuiltOne.getSpeed() + " MPH and has "
                + prebuiltOne.getGas() + "% of its gas left.");

        mainMenu.customMenu(prebuiltOne);
    }

}


