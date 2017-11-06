package io.zipcoder.pets;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(){
        this.name = "Pet";
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak(){
        return "Holy shit I can talk!!";
    }
}
