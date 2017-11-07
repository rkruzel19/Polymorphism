package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        int numberOfPets;
        String nameOfPet;
        String kindOfPet;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        numberOfPets = Integer.parseInt(scanner.nextLine());

        String output = "The user has " + numberOfPets + " pets:";

        for (int i = 1; i <= numberOfPets; i++){
            System.out.println("What type of pet do you have?\n" +
                               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                               "1)Dog\n" +
                               "2)Cat\n" +
                               "3)Fish\n" +
                               "4)Other");
            kindOfPet = scanner.nextLine();

            System.out.println("What is it's name?");
            nameOfPet = scanner.nextLine();

            if (kindOfPet.equals("1") || kindOfPet.equalsIgnoreCase("dog")){
                Dog dog = new Dog(nameOfPet);
                pets.add(dog);
            } else if (kindOfPet.equals("2") || kindOfPet.equalsIgnoreCase("cat")){
                Cat cat = new Cat(nameOfPet);
                pets.add(cat);
            } else if (kindOfPet.equals("3") || kindOfPet.equalsIgnoreCase("fish")){
                Fish fish = new Fish(nameOfPet);
                pets.add(fish);
            } else if (kindOfPet.equals("4") || kindOfPet.equalsIgnoreCase("other")){
                Pet pet = new Pet(nameOfPet);
                pets.add(pet);
            }

        }

        System.out.println(output);
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).getName() + ": " + pets.get(i).speak());
        }

        System.out.println();
        Collections.sort(pets, new Pet());

        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).getName() + ": " + pets.get(i).speak());
        }

    }

}
