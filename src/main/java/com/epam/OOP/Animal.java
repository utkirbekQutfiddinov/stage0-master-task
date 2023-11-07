package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        return "This animal is mostly "+this.color
                +". It has "+getPaws()+" and "+(isHasFur()?"a":"no")+" fur.";
    }

    private String getPaws(){
        if(this.numberOfPaws==0){
            return "no";
        }
        if(this.numberOfPaws==1){
            return "a paw";
        }else{
            return numberOfPaws+" paws";
        }
    }

    public boolean isHasFur() {
        return hasFur;
    }
}
