package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void getNameTest(){
        Dog dog = new Dog();
        dog.setName("Roxy");
        String expected = "Roxy";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog();
        String expected = "bark!";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

}