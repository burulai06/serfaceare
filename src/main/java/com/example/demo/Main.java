package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape3DInterface> shapes = new ArrayList<>();

        // Генерация 10 случайных 3D фигур
        for (int i = 0; i < 10; i++) {
            int randomShapeType = (int) (Math.random() * 3);
            switch (randomShapeType) {
                case 0 -> shapes.add(new Sphere());
                case 1 -> shapes.add(new Cylinder());
                case 2 -> shapes.add(new Cube());пше фвв

            }
        }

        // Вывод информации о каждой фигуре
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.println("Surface Area: " + shape.surfaceArea());
            System.out.println("Volume: " + shape.volume());
            System.out.println();
        }
    }
}
