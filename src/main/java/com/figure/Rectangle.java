package com.figure;

import com.figure.Point;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle (Point topLeft, double width, double height) {
        super(topLeft, "Прямоугольник");
        this.width = width;
        this.height = height;
    }

    public Rectangle(double x, double y, double width, double height) {
        this(new Point(x, y), width, height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public void setSize(double width, double height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        }
    }

    //Метод для получения периметра
    public double getPerimeter() {
        return 2 * (width + height);
    }

    //Метод для проверки, является ли прямоугольник квадратом
    public boolean isSquare() {
        return Math.abs(width - height) < 1e-10;
    }


    //Метод для получения центра прямоугольника
    public Point getCenter() {
        return new Point(position.getX() + width / 2, position.getY() + height / 2);
    }

    @Override
    public String toString() {
        return String.format("%s [topLeft=%s, width=%.2f, height=%.2f, area=%.2f]",
                name, position, width, height, getArea());
    }
}