package com.figure;

import java.util.ArrayList;
import java.util.List;

public class FigureMain {

    public static void main(String[] args) {

        /*Практика ООП. *Полиморфизм #10. Общая площадь - задание необязательное*/
        System.out.println(" -- Смешанный набор -- ");

        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(new Point(0, 0), 5.0));
        figures.add(new Square(new Point(10, 10), 4.0));
        figures.add(new Rectangle(new Point(20, 20), 6.0, 3.0));
        figures.add(new Circle(30, 30, 3.0));
        figures.add(new Square(40, 40, 5.0));

        TotalArea.printAreasInfo(figures);
        double totalArea1 = TotalArea.sumAllAreas(figures);
        System.out.printf("\nРезультат sumAllAreas: %.2f%n", totalArea1);

        // КРУГИ
        System.out.println(" -- Только круги -- ");

        List<Figure> circles = new ArrayList<>();
        circles.add(new Circle(0, 0, 3.0));
        circles.add(new Circle(7, 6, 3.0));
        circles.add(new Circle(10, 10, 3.0));
        circles.add(new Circle(15, 15, 3.0));

        TotalArea.printAreasInfo(circles);
        double circles1 = TotalArea.sumAllAreas(circles);
        System.out.printf("\nРезультат sumAllAreas: %.2f%n", circles1);

        // КВАДРАТЫ

        System.out.println(" -- Только квадраты -- ");

        List<Figure> squares = new ArrayList<>();
        squares.add(new Square(new Point(0, 0), 4.0));
        squares.add(new Square(new Point(10, 10), 9.0));
        squares.add(new Square(new Point(20, 20), 16.0));
        squares.add(new Square(new Point(30, 30), 1.2));

        TotalArea.printAreasInfo(squares);
        double squares1 = TotalArea.sumAllAreas(squares);
        System.out.printf("\nРезультат sumAllAreas: %.2f%n", squares1);



        /*Практика ООП. *Полиморфизм #9. Фигуры - задание необязательное*/
        //создаем различные фигуры
        /*
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
        }*/
    }
}