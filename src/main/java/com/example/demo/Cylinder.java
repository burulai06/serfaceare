package com.example.demo;

import java.util.Random;

public class Cylinder implements Shape3DInterface {
    private final double radius;
    private final double height;

    public Cylinder() {
        Random random = new Random();
        this.radius = 1 + (9 * random.nextDouble()); // Радиус от 1 до 10
        this.height = 5 + (15 * random.nextDouble()); // Высота от 5 до 20
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder (radius = " + radius + ", height = " + height + ")";
    }
}
