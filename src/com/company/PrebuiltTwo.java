package com.company;

import java.util.Scanner;

import static com.company.Main.mainMenu;

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

    protected void getPrebuiltTwoInfo(){

        System.out.println("Your current car is a " + getColor() + " " + getYear() + " " + getMake() + " " + getModel() + ". It is going "
                + getSpeed() + " MPH and has " + getGas() + "% of its gas left.");
    }

}
