package com.epam.mjc.stage0;

public class Dog extends Animal {

    // No-argument constructor for Dog
    public Dog() {
        super("brown", 4, true); // Pass required values to the Animal constructor
    }

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }
}

