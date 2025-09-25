package com.figure;

import com.figure.Point;

public abstract class Figure {

    protected Point position;
    protected String name;

    public Figure(Point position, String name) {
        this.position = position;
        this.name = name;
    }

    //Для каждой
    //фигуры обязательно должна быть возможность рассчитать её площадь (getArea).
    public abstract double getArea(); //метод для расчета площади (в каждом дочернем классе)

    public String getName() {
        return name;    //получения имени фигуры
    }

    public Point getPosition() {
        return position;    //получения позиции фигуры
    }

    public void move(Point newPosition) {   // для перемещения фигуры
        if (newPosition != null) {
            this.position = newPosition;
        }
    }

    @Override
    public String toString() {
        return String.format("%s [position=%s, area=%.2f]", name, position, getArea());
    }
}