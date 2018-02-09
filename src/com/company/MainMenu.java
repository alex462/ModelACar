package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void createCar() {

        System.out.println("Welcome to Model a Car!");
        System.out.println("Please enter the number corresponding to one of the following options:\n1. Prebuilt vehicle #1\n2. " +
                "Prebuilt vehicle #2\n3. Custom - build your own car\n4. Exit");

            try {
                switch (input.nextInt()) {
                    case 1: //Hambo
                        PrebuiltOne prebuiltOne = new PrebuiltOne(2012, "a'Lexis", "Hambourghini", 0, 100, "red");
                        prebuiltOne.getPrebuiltOneInfo();
                        hamboMenu(prebuiltOne);
                        break;
                    case 2: //Rati
                        PrebuiltTwo prebuiltTwo = new PrebuiltTwo(1993, "ef-Ford", "Mazderati", 0, 100, "baby blue");
                        prebuiltTwo.getPrebuiltTwoInfo();
                        ratiMenu(prebuiltTwo);
                        break;
                    case 3: //Custom
                        Car car = new Car();
                        car.getCarInfo();
                        customMenu(car);
                        break;
                    case 4:
                        //exit
                        System.exit(13);
                        break;
                    default:
                        System.out.println("Please enter the number corresponding to the action you choose: ");
                        createCar();
                }

            } catch (InputMismatchException ime) {
                input.nextLine();


                System.out.println("Please enter either a number between 1 and 4: ");
                createCar();
            }
        }


    public void customMenu(Car car){ //make method take a car object and pass into method

        //want to accel, dec, and fill up gas
        System.out.println("\nWhat would you like to do with your " + car.getModel() + "?");
        System.out.println("1. Accelerate\n2. Decelerate\n3. Fill up your gas tank\n4. Exit");

        try{
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
                    customMenu(car);
            }

        }catch(InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter either a number between 1 and 4: ");
            customMenu(car);
        }
    }

    public void hamboMenu(PrebuiltOne prebuiltOne){ //make method take a car object and pass into method

        //want to accel, dec, and fill up gas
        System.out.println("\nWhat would you like to do with your " + prebuiltOne.getModel() + "?");
        System.out.println("1. Accelerate\n2. Decelerate\n3. Fill up your gas tank\n4. Exit");

        try{
            switch(input.nextInt()){
                case 1:
                    //accelerate
                    prebuiltOne.drivePrebuiltOne(prebuiltOne);
                    break;
                case 2:
                    //decelerate
                    prebuiltOne.slowPrebuiltOne(prebuiltOne);
                    break;
                case 3:
                    //gas
                    prebuiltOne.addGas(prebuiltOne);
                    break;
                case 4:
                    //exit
                    System.exit(13);
                    break;
                default:
                    System.out.println("Please enter the number corresponding to the action you choose: ");
                    hamboMenu(prebuiltOne);
            }

        }catch(InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter either a number between 1 and 4: ");
            hamboMenu(prebuiltOne);
        }
    }

    public void ratiMenu(PrebuiltTwo prebuiltTwo){ //make method take a car object and pass into method

        //want to accel, dec, and fill up gas
        System.out.println("\nWhat would you like to do with your " + prebuiltTwo.getModel() + "?");
        System.out.println("1. Accelerate\n2. Decelerate\n3. Fill up your gas tank\n4. Exit");

        try{
            switch(input.nextInt()){
                case 1:
                    //accelerate
                    prebuiltTwo.drivePrebuiltTwo(prebuiltTwo);
                    break;
                case 2:
                    //decelerate
                    prebuiltTwo.slowPrebuiltTwo(prebuiltTwo);
                    break;
                case 3:
                    //gas
                    prebuiltTwo.addGas(prebuiltTwo);
                    break;
                case 4:
                    //exit
                    System.exit(13);
                    break;
                default:
                    System.out.println("Please enter the number corresponding to the action you choose: ");
                    ratiMenu(prebuiltTwo);
            }

        }catch(InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter either a number between 1 and 4: ");
            ratiMenu(prebuiltTwo);
        }
    }
}
