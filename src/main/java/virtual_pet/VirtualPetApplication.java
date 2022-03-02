package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    /**
     * This class implements simple console application with the following interations:
     * 1:play with your pet
     * 2:change the name of your pet
     * 3:feed your pet
     * 4.hydrate your pet
     * 5:quite this game.
     */

    private Scanner input;
    public static void main(String[] args) {
        new VirtualPetApplication().gameLoop();

    }

    public void gameLoop() {
        VirtualPetShelter myPets = new VirtualPetShelter();
        input=new Scanner(System.in);


        while (true){
            System.out.println(myPets.showHealth());
            System.out.println("------------------------------------------");
            System.out.println("please select from these options: ");
            System.out.println("------------------------------------------");
            System.out.println("[1]: play with all pets.");
            System.out.println("------------------------------------------");
            System.out.println("[2]: Walk all pets.");
            System.out.println("------------------------------------------");
            System.out.println("[3]: Adopt a pet.");
            System.out.println("------------------------------------------");
            System.out.println("[4]: Add a pet.");
            System.out.println("------------------------------------------");
            System.out.println("[5]: Oil your robotic pet ");
            System.out.println("------------------------------------------");
            System.out.println("[6]: Clean your organic pets? ");
            System.out.println("------------------------------------------");
            System.out.println("[7]: Maintain your robotic pets? ");
            System.out.println("------------------------------------------");
            System.out.println("[8]: quite this game. ");
            System.out.println("------------------------------------------");



            int selection = input.nextInt();

            if (selection == 1) {
                myPets.playWithAll();

            }  if (selection == 2) {
                myPets.walkAllPets();
            }

            if (selection == 3) {
                System.out.println("which pet would you like to adopt? ");
                input.nextLine();
                System.out.println(myPets.showAllPets());
                String adoptedPet = input.nextLine();
                myPets.adoptAPet(adoptedPet);

            }

            if (selection == 4) {
                System.out.println("What kind of pet would you like to add \n[1]: Organic cat \n[2]: Organic dog \n[3]: Robotic cat \n [4]: Robotic dog");
                int typeOfPet=input.nextInt();
                input.nextLine();

                    if(typeOfPet==1){
                        myPets.addPet(createOrganicCat());

                    }
                    if (typeOfPet==2){
                        myPets.addPet(createOrganicDog());
                    }
                    if (typeOfPet==3){
                    myPets.addPet(createMechanicalCat());
                      }
                    if (typeOfPet==4){
                    myPets.addPet(createMechanicalDog());
                    }

            }
            if (selection==5){
                myPets.oilAllPets();
            }

            if (selection==6){
                myPets.cleanAllPets();

            }
            if (selection==7){
                myPets.maintenanceAllPets();

            }
            if (selection == 8) {
                System.out.println("You have selected to quite this game. ");
                break;
            }
            myPets.tickPets();
        }
//        while (selection !=5);
//            input.close();
//            System.out.println("goodbye!");


        //Interact with a VirtualPet object in this method

    }
    private VirtualPet createMechanicalDog() {

        System.out.print("Enter you pet's name: ");
        String name = input.nextLine();
        System.out.print("Enter your pet's age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("What is the oil percentage of your pet?");
        int oilLevel = input.nextInt();
        input.nextLine();
        System.out.println("what is the battery percentage of your mechanical pet? ");
        int betteryPercentage =input.nextInt();
        input.nextLine();
        System.out.println("What is the maintenance level of your pet ");
        int maintenanceLevel =input.nextInt();
        input.nextLine();
        return new RobaticDog(name,age);

    }
    private VirtualPet createMechanicalCat() {

        System.out.print("Enter you pet's name: ");
        String name = input.nextLine();
        System.out.print("Enter your pet's age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("What is the oil percentage of your pet?");
        int oilLevel = input.nextInt();
        input.nextLine();
        System.out.println("what is the battery percentage of your mechanical pet? ");
        int betteryPercentage =input.nextInt();
        input.nextLine();
        System.out.println("What is the maintenance level of your pet ");
        int maintenanceLevel =input.nextInt();
        input.nextLine();

        return new RobaticCat(name,age);
    }
    private VirtualPet createOrganicCat() {

        System.out.print("Enter you pet's name: ");
        String name = input.nextLine();
        System.out.print("Enter your pet's age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("What is the boredom level of your pet?");
        int boredomLevel = input.nextInt();
        input.nextLine();
        System.out.println("what is the thirst level of your pet? ");
        int thirstLevel =input.nextInt();
        input.nextLine();
        System.out.println("What is the hunger level of your pet ");
        int hungerLevel =input.nextInt();
        input.nextLine();
        return new OrganicCat(name,age);

    }
    private VirtualPet createOrganicDog() {

        System.out.print("Enter you pet's name: ");
        String name = input.nextLine();
        System.out.print("Enter your pet's age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("What is the boredom level of your pet?");
        int boredomLevel = input.nextInt();
        input.nextLine();
        System.out.println("what is the thirst level of your pet? ");
        int thirstLevel =input.nextInt();
        input.nextLine();
        System.out.println("What is the hunger level of your pet ");
        int hungerLevel =input.nextInt();
        input.nextLine();
        return new OrganicDog(name,age);

    }
}




