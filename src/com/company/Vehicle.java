package com.company;


import java.util.Scanner;


/*
abstract classes are good when you have a foundation class with information that other classes will use, but that will never be used by itself.
 */

public abstract class Vehicle {

    private int year;
    private String make;
    private String model;
    private String color;
    private Scanner input = new Scanner(System.in);


    public Vehicle(int year, String make, String model, String color) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle(){

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


//    public void chooseVehicle(){
//
//        System.out.println("Welcome to Model a Car!");
//        System.out.println("Please enter the number corresponding to one of the following options:\n1. Prebuilt vehicle #1\n2. " +
//                "Prebuilt vehicle #2\n3. Build your own car\n4. Exit");
////        String str = null;
////        String message = (str == null) ? "" :
////                          str.substring(0,5);
////        System.out.println(message);
//// str = "Geeksforgeeks";
////        message = (str == null) ? "" : str.substring(0,5);
////        System.out.println(message);
//        try{
////            int action;
//            switch(input.nextInt()){
//                case 1:
//                    //prebuiltOne
//                    PrebuiltOne prebuiltOne = null;
////                    prebuiltOne.getCarInfo() = (prebuiltOne == null) ? "" : prebuiltOne.getCarInfo();
//                    break;
//                case 2:
//                    //prebuiltTwo
//                    PrebuiltTwo prebuiltTwo = null;
//                    prebuiltTwo.getCarInfo();
//                    break;
//                case 3:
//                    //buildCar
//                    Car car = null;
//                    car.getCarInfo();
//                    break;
//                case 4:
//                    //exit
//                    System.exit(13);
//                    break;
//                default:
//                    System.out.println("Please enter the number corresponding to the action you choose: ");
//            }
//        }catch(InputMismatchException ime){
//            input.nextLine();
//            System.out.println("Please enter either a number between 1 and 4: ");
//            chooseVehicle();
//        }
//    }
//
//    public void getCarInfo(){
//
//        System.out.println("Your current car is a " + getYear() + " " + getMake() + " " + getModel() + ".");
////                It is going " + getSpeed() + " MPH and has " + getGas() + "% of its gas left."
//    }
}
