package com.figure;

import java.util.Arrays;
import java.util.List;

public class TotalArea {

    //Метод для расчета общей площади набора фигур
    public static double sumAllAreas(List<Figure> figures) {
        if (figures == null || figures.isEmpty()) {
            return 0.0;
        }

        double totalArea = 0.0;
        for (Figure figure : figures) {
            totalArea += figure.getArea(); // Полиморфный вызов!
        }

        return totalArea;
    }

    //Перегруженный метод для работы с массивом фигур
    public static double sumAllAreas(Figure... figures) {
        if (figures == null || figures.length == 0) {
            return 0.0;
        }

        return sumAllAreas(Arrays.asList(figures));
    }

    //Метод для вывода подробной информации о площадях
    public static void printAreasInfo(List<Figure> figures) {
        if (figures == null || figures.isEmpty()) {
            System.out.println("Нет фигур для анализа");
            return;
        }

        System.out.println("=== ДЕТАЛЬНАЯ ИНФОРМАЦИЯ О ПЛОЩАДЯХ ===");
        System.out.printf("Всего фигур: %d%n%n", figures.size());

        double totalArea = 0.0;
        int circleCount = 0;
        int squareCount = 0;
        int rectangleCount = 0;

        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            double area = figure.getArea();
            totalArea += area;

            // Статистика по типам фигур
            if (figure instanceof Circle) {
                circleCount++;
            } else if (figure instanceof Square) {
                squareCount++;
            } else if (figure instanceof Rectangle) {
                rectangleCount++;
            }

            System.out.printf("%d. %s: площадь = %.2f%n", i + 1, figure.getName(), area);
        }

        System.out.println("\n=== СТАТИСТИКА ===");
        System.out.printf("Круги: %d шт.%n", circleCount);
        System.out.printf("Квадраты: %d шт.%n", squareCount);
        System.out.printf("Прямоугольники: %d шт.%n", rectangleCount);
        System.out.printf("ОБЩАЯ ПЛОЩАДЬ: %.2f%n", totalArea);
    }
}