package com.example.demo;

import java.util.Random;

public class Cube implements Shape3DInterface {
    private final double side;

    public Cube() {
        Random random = new Random();
        this.side = 1 + (9 * random.nextDouble()); // Сторона от 1 до 10
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube (side = " + side + ")";
    }
}
