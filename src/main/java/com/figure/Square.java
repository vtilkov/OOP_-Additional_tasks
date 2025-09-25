package com.figure;

import com.figure.Point;

public class Square extends Figure {

    private double side;

    public Square(Point topLeft, double side) {
        super(topLeft, "Квадрат");
        this.side = side;
    }

    public Square(double x, double y, double side) {
        this(new Point(x, y), side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public double getArea() {
        return side * side;
    }

    //Метод для получения периметра
    public double getPerimeter() {
        return 4 * side;
    }

    //Метод для получения центра квадрата
    public Point getCenter() {
        return new Point(position.getX() + side / 2, position.getY() + side / 2);
    }

    @Override
    public String toString() {
        return String.format("%s [topLeft=%s, side=%.2f, area=%.2f]",
                name, position, side, getArea());
    }
}