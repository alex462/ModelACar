package com.company;

import java.util.Scanner;

import static com.company.Main.mainMenu;

public class PrebuiltTwo extends Vehicle {

    private int speed = 0;
    private int gas = 100;
    private Scanner input = new Scanner(System.in);


    public PrebuiltTwo() {

        setMake("ef-Ford");
        setModel("Mazderati");
        setYear(1993);
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

}
