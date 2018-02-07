package com.company;

import java.util.Scanner;

import static com.company.Main.mainMenu;

//MAZDERATI
public class PrebuiltTwo extends Car {

    private String color;
    private int speed = 0;
    private int gas = 100;
    private Scanner input = new Scanner(System.in);


//    public PrebuiltTwo() {
//
//        setMake("ef-Ford");
//        setModel("Mazderati");
//        setYear(1993);
//        setSpeed(0);
//        setGas(100);
//    }


    public PrebuiltTwo(int year, String make, String model, int speed, int gas, String color) {

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

    protected void getPrebuiltTwoInfo() {

        System.out.println("Your current car is a " + getColor() + " " + getYear() + " " + getMake() + " " + getModel() + ". It is going "
                + getSpeed() + " MPH and has " + getGas() + "% of its gas left.");
    }

    public void drivePrebuiltTwo(PrebuiltTwo prebuiltTwo) { //require that method take the car object bc we need to see the speed of the car before we do anything with it.

        for (int seconds = 0; seconds <= 5; seconds++) {
            if (prebuiltTwo.getSpeed() < 160) {
                prebuiltTwo.setSpeed(prebuiltTwo.getSpeed() + 3);
                prebuiltTwo.setGas(prebuiltTwo.getGas() - 1);

            }
            if (prebuiltTwo.getSpeed() >= 160) {
                prebuiltTwo.setSpeed(160);
                System.out.println("Your Mazderati has topped out at 160. Please decelerate.");
                break;
            }
            if ((prebuiltTwo.getGas()) <= 0) {
                prebuiltTwo.setSpeed(0);
                prebuiltTwo.setGas(getGas());
                System.out.println("You've run out of gas!");
                break;
            }

            System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + prebuiltTwo.getSpeed() + " MPH and has "
                    + prebuiltTwo.getGas() + "% of its gas left.");
        }

        mainMenu.ratiMenu(prebuiltTwo);
    }

    public void slowPrebuiltTwo(PrebuiltTwo prebuiltTwo) {

        for (int seconds = 0; seconds <= 5; seconds++) {
            if ((prebuiltTwo.getSpeed() <= 160) && (prebuiltTwo.getSpeed()) >= 1) {
                prebuiltTwo.setSpeed(prebuiltTwo.getSpeed() - 1);
                prebuiltTwo.setGas(prebuiltTwo.getGas() - 1);
            }
            if ((prebuiltTwo.getGas()) <= 0) {
                prebuiltTwo.setSpeed(0);
                prebuiltTwo.setGas(getGas());
                System.out.println("You've run out of gas!");
                break;
            } else if ((prebuiltTwo.getGas()) >= 5) {
                prebuiltTwo.setGas(prebuiltTwo.getGas());
            } else if (prebuiltTwo.getSpeed() < 6) {
                prebuiltTwo.setSpeed(0);
            }

            System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + prebuiltTwo.getSpeed() + " MPH and has "
                    + prebuiltTwo.getGas() + "% of its gas left.");
        }

        mainMenu.ratiMenu(prebuiltTwo);
    }

    public void addGas(PrebuiltTwo prebuiltTwo) {

        prebuiltTwo.setGas(100);

        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " now has a full tank of gas!");
        prebuiltTwo.setSpeed(0);
        System.out.println("Your " + getYear() + " " + getMake() + " " + getModel() + " is going " + prebuiltTwo.getSpeed() + " MPH and has "
                + prebuiltTwo.getGas() + "% of its gas left.");

        mainMenu.customMenu(prebuiltTwo);
    }
}
