package com.figure;

import java.util.ArrayList;
import java.util.List;

public class FigureMain {

    public static void main(String[] args) {

        //создаем различные фигуры
        List<Figure> figures = new ArrayList<>();

        figures.add(new Circle(new Point(0, 0), 5.0));
        figures.add(new Square(new Point(10, 10), 4.0));
        figures.add(new Rectangle(new Point(20, 20), 6.0, 3.0));
        figures.add(new Circle(30, 30, 3.0));
        figures.add(new Square(40, 40, 5.0));

        System.out.println(" -- Расчет площади фигуры -- ");
        //выведем фигуры с рассчитаной площадью
        for (Figure f : figures) {
            System.out.printf("%s: площадь = %.2f%n", f.getName(), f.getArea());
        }
    }
}