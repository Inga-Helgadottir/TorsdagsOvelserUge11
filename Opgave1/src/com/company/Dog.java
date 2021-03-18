package com.company;
import java.util.Arrays;
public class Dog {
    String woodie;
    boolean b;
    Owner owner;
    private String[] offSpring;
    boolean isHungry;

    public Dog(String woodie, boolean b) {
        this.woodie = woodie;
        this.b = b;
        offSpring = new String[5];
    }

    public String[] setOffSpring(String child) {
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
            for (String o: offSpring) {
                if(o == null){
                    boolean noNull = false;
                }else{
                    boolean noNull = true;
                }
            }
            return offSpring;
    }

    public String[] getOffSpring() {//------------------------------------
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
}
