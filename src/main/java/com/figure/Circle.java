package com.figure;

import com.figure.Point;

public class Circle extends Figure {

    private double radius;

    public Circle(Point center, double radius) {
        super(center, "Круг");
        this.radius = radius;
    }

    public Circle(double centerX, double centerY, double radius) {
        this(new Point(centerX, centerY), radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Метод для получения длины окружности
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format(name, position, radius, getArea());
    }
}