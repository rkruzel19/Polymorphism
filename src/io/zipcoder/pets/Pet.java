package io.zipcoder.pets;

import java.util.Comparator;

public class Pet implements Comparable<Pet>, Comparator<Pet> {

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

    public int compareTo(Pet petToCompare) {

        if (this.getName().compareToIgnoreCase(petToCompare.getName()) == 0){
            return this.getClass().getSimpleName().compareTo(petToCompare.getClass().getSimpleName());
        }
        return this.getName().compareToIgnoreCase(petToCompare.getName());
    }

    public int compare(Pet pet1, Pet pet2) {
        if (pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName()) == 0){
            return pet1.getName().compareToIgnoreCase(pet2.getName());
        }
        return pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());
    }
}
