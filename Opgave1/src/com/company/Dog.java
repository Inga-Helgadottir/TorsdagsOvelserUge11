package com.company;

import java.util.Arrays;

public class Dog {
    String name;
    boolean b;
    private Owner owner;
    private Dog[] offSpring;
//    private String[] offSpring;
    boolean isHungry;

    public Dog(String name, boolean b, Owner owner) {
        this.name = name;
        this.b = b;
        this.owner = owner;
//        offSpring = new String[5];
        offSpring = new Dog[5];
    }

    public Dog[] setOffSpring(String child) {//public String[] setOffSpring(String child) {
        boolean isPlaced = false;
        boolean isPlaced2 = false;
        int i = 0;
        while(!isPlaced){
            if(i > offSpring.length - 1) isPlaced = true;
            if(offSpring[i] == null){
//                offSpring[i] = child;
                offSpring[i] = new Dog(child, true, this.owner);
                isPlaced = true;
            } else {
                i++;
            }
        }
        return offSpring;
        /*
            boolean isPlaced = false;
            int i = 0;
            while(!isPlaced){
                if(i > offSpring.length - 1) isPlaced = true;
                if(offSpring[i] == null){
                    offSpring[i] = child;
                    isPlaced = true;
                } else {
                    i++;
                }
            }
            return offSpring;*/
    }

    public Dog[] getOffSpring() {
        return offSpring;
    }

    public String getOwner() {
        return owner.getName();
    }

    public void setOwner(String ownerName) {
        owner.setName(ownerName);
    }

    public String feedDog() {
        isHungry = false;
        return "The dog is eating now!";
    }

    @Override
    public String toString() {
        return "\nDog{" +
                "woodie='" + name + '\'' +
                ", b=" + b +
                ", owner=" + owner +
                ", isHungry=" + isHungry +
                ", offspring=" + Arrays.toString(offSpring) +
                '}';
    }
}
