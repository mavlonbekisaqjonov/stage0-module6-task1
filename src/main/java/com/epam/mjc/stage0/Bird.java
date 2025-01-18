package com.epam.mjc.stage0;

public class Bird extends Animal {

    // No-argument constructor for Bird
    public Bird() {
        super("blue", 2, false); // Pass required values to the Animal constructor
    }

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
}

