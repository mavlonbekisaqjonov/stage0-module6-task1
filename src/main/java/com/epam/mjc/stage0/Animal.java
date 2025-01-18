package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    protected String getBasicDescription() {
        String description = "This animal is mostly " + color + ". It has " + numberOfPaws;
        description += (numberOfPaws > 1) ? " paws" : " paw";
        description += hasFur ? " and a fur." : " and no fur.";
        return description;
    }

    public String getDescription() {
        return getBasicDescription();
    }
}

