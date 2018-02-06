package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void createCar() {

        Vehicle vehicle = new Vehicle();
        vehicle.chooseVehicle();

        Car car = new Car();
        car.getCarInfo();


        PrebuiltOne prebuiltOne = new PrebuiltOne();
        prebuiltOne.getCarInfo();
//        menu(prebuiltOne);

        PrebuiltTwo prebuiltTwo = new PrebuiltTwo();
        prebuiltTwo.getCarInfo();
//        menu(prebuiltTwo);

        menu(car);
    }

    public void menu(Car car){ //make method take a car object and pass into method

        //want to accel, dec, and fill up gas
        System.out.println("\nWhat would you like to do with your "+ car.getYear() + " " + car.getMake() + " " + car.getModel() + "?");
        System.out.println("1. Accelerate\n2. Decelerate\n3. Fill up your gas tank\n4. Exit");

        try{
//            int action;
            switch(input.nextInt()){
                case 1:
                    //accelerate
                    car.driveCar(car);
                    break;
                case 2:
                    //decelerate
                    car.slowDown(car);
                    break;
                case 3:
                    //gas
                    car.addGas(car);
                    break;
                case 4:
                    //exit
                    System.exit(13);
                    break;
                default:
                    System.out.println("Please enter the number corresponding to the action you choose: ");
            }
        }catch(InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter either a number between 1 and 4: ");
            menu(car);
        }
    }
}
