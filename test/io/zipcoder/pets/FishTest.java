package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {

    @Test
    public void getNameTest(){
        Fish fish = new Fish();
        fish.setName("Goldy");
        String expected = "Goldy";
        String actual = fish.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        Fish fish = new Fish();
        String expected = "stares blankly...";
        String actual = fish.speak();

        Assert.assertEquals(expected, actual);
    }

}