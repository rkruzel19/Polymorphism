package io.zipcoder.pets;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOfPets;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        numberOfPets = Integer.parseInt(scanner.nextLine());
        String nameOfPet;
        String kindOfPet;
        String output = "The user has " + numberOfPets + " pets:\n";

        for (int i = 1; i <= numberOfPets; i++){
            System.out.println("What kind of pet is it?");
            kindOfPet = scanner.nextLine();

            System.out.println("What is it's name?");
            nameOfPet = scanner.nextLine();

            output += nameOfPet + " the " + kindOfPet + "\n";
        }

        System.out.println(output);
    }

}
