package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void createCar() {

        System.out.println("Welcome to Model a Car!");
        System.out.println("Please enter the number corresponding to one of the following options:\n1. Prebuilt vehicle #1\n2. " +
                "Prebuilt vehicle #2\n3. Custom - build your own car\n4. Exit");

        try{
            switch(input.nextInt()){
                case 1: //Hambo
                    PrebuiltOne prebuiltOne = new PrebuiltOne(2012, "a'Lexis", "Hambourghini", 0, 100, "brown");
                    prebuiltOne.getPrebuiltOneInfo();
                    menu(prebuiltOne);
                    break;
                case 2: //Rati
                    PrebuiltTwo prebuiltTwo = new PrebuiltTwo(1993, "ef-Ford", "Mazderati", 0, 100, "brown");
                    prebuiltTwo.getPrebuiltTwoInfo();
                    menu(prebuiltTwo);
                    break;
                case 3: //Custom
                    Car car = new Car();
                    car.getCarInfo();
                    menu(car);
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
            createCar();
        }

    }

    public void menu(Car car){ //make method take a car object and pass into method

        //want to accel, dec, and fill up gas
        System.out.println("\nWhat would you like to do with your " + car.getModel() + "?");
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
                    car.slowCar(car);
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
