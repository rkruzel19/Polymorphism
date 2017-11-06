package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

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


}