package ru.courses.geometry;

import java.awt.Point; //будет доступен по простому имени

public class PointMain {

    public static void main(String[] args) {

        Point awtPoint = new Point(1, 10); //по простому имени (экземпляр класса Point из java.awt)

        //по полному имени (экземпляр класса Point из ru.courses.geometry)
        ru.courses.geometry.Point geometryPoint = new ru.courses.geometry.Point(2, 20);

        System.out.println("Точка из java.awt: " + awtPoint); //по простому имени
        System.out.println("Точка из ru.courses.geometry: " + geometryPoint); //по полному имени
    }
}