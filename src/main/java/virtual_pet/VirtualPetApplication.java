package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {
/**
 * This class implements simple console application with the following interations:
 *             1: play with your pet
 *             2: change the name of your pet
 *             3: feed your pet
 *             4: hydrate your pet
 *             5: quite this game.
 *
 */
public static void main(String[] args) {

        VirtualPetApplication myPets = new VirtualPetApplication();

        myPets.virtualTest();
    }

    public void virtualTest() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter you pet's name: ");
        String name = input.nextLine();

        System.out.print("your pet is: " + name);
        name = input.nextLine();

        System.out.print("Enter your pet's age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("your pet's age is " + age);

        System.out.print("Enter your pet's breed: ");
        String breed = input.nextLine();
        System.out.print("your pets's breed is: " + breed);

        System.out.print("How bored is your pet?");
        int boredomLevel = input.nextInt();
        input.nextLine();

     VirtualPet myPet = new VirtualPet(name,50,50,boredomLevel,age,breed);

        int selection = input.nextInt();


        do {
            System.out.println("please select from these options: ");
            System.out.println("1: play with your pet.");
            System.out.println("2: change the name of your pet.");
            System.out.println("3: feed your pet.");
            System.out.println("4: hydrate your pet.");
            System.out.println("5: quite this game. ");


            selection = input.nextInt();


            if (selection == 1) {
                System.out.println("Your pet is no longer bored ");
                myPet.play();

                continue;

            }

            else if (selection == 2) {
                System.out.println("what would you like to name your pet? ");
                String newName = input.nextLine();

                if (!name.equals(newName)) {

                    System.out.println("Your pet's name is: " + newName);


                } else {
                    System.out.println("your pet's name is : " + name);
                }
                continue;

            }
            else if (selection == 3) {
                System.out.println("what would you like to feed your pet? ");
                String feeding = input.nextLine();
                myPet.getHungerLevel();

                continue;


            }
            else if (selection == 4) {
                System.out.println("Your pet is no longer thirsty!");
                myPet.giveWater();

            }
            if (selection == 5) {
                System.out.println("You have selected to quite this game. ");
                //break;

            }

        } while (selection !=5);
        input.close();
        System.out.println("goodbye! ");


        System.out.println();
        System.out.println();
        //Interact with a VirtualPet object in this method

    }
}



