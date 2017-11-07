package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void testPetName(){
        Pet pet1 = new Pet("Roxy");
        String expected = "Roxy";
        String actual = pet1.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changePetName(){
        Pet pet = new Pet("Roxy");
        pet.setName("Roxxxxy");
        String expected = "Roxxxxy";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTo(){
        Cat tom = new Cat("Tom");
        Cat ted = new Cat("Ted");
        Cat roy = new Cat("Roy");
        Cat ron = new Cat("Ron");
        Dog dog = new Dog("Tom");
        Dog dog1 = new Dog("Sam");

        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(tom);
        pets.add(ted);
        pets.add(roy);
        pets.add(ron);
        pets.add(dog);
        pets.add(dog1);

        String expected = "some sorted cats";

        Collections.sort(pets);

        String actual = "";

        for(int i = 0; i<pets.size(); i++){
            actual += pets.get(i).getName() + ": " + pets.get(i).speak() + "\n";
        }


        Assert.assertEquals(expected,actual);
    }


}