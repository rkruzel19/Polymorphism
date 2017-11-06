package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getNameTest(){
        Cat cat = new Cat();
        cat.setName("Suki");
        String expected = "Suki";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat();
        String expected = "meow!";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

}