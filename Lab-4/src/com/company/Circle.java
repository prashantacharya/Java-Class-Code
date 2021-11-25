package com.company;

public class Circle {
    public int centerX, centerY;
    public float radius;

    Circle(int centerX, int centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    Circle(float radius) {
        this.centerX = 0;
        this.centerY = 0;
        this.radius = radius;
    }

    void printCircleInformation() {
        System.out.printf("Center: (%d, %d), Radius: %f%n", centerX, centerY, radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(10, 10, 5);
        Circle c2 = new Circle(5);

        c1.printCircleInformation();
        c2.printCircleInformation();
    }
}
