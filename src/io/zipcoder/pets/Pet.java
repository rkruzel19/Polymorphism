package io.zipcoder.pets;

public class Pet {

    private String name;

    Pet(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak(){
        System.out.println("Wordddds");
    }
}