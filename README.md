Shape3D Project

Description

This project generates 10 random 3D shape objects (Sphere, Cylinder, Cube) and calculates their surface area and volume. The project demonstrates the use of polymorphism where all shapes implement the `Shape3DInterface` to calculate their properties.

Classes:

- **Shape3DInterface**: Interface that defines the methods `getSurfaceArea()`, `getVolume()`, and `getName()`.
- **Sphere**: Implements the `Shape3DInterface` and calculates properties for a sphere.
- **Cylinder**: Implements the `Shape3DInterface` and calculates properties for a cylinder.
- **Cube**: Implements the `Shape3DInterface` and calculates properties for a cube.
- **Main**: The main class that generates random shapes and outputs their information.

Polymorphism

Polymorphism is used in this project through the `Shape3DInterface`. All the 3D shapes (Sphere, Cylinder, Cube) implement this interface, allowing them to be handled in a unified way, while each shape class has its own implementation for calculating surface area and volume.

 How to Run

1. Clone this repository using Git.
2. Compile the Java files using `javac`.
3. Run the `Main` class with `java Main`.
