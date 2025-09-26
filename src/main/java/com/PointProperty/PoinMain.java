package com.PointProperty;

public class PoinMain {
    public static void main(String[] args) {

        // 1.Точка в координате 4, синего цвета
        Point redPoint1D = new Point();
        redPoint1D.addProperty(new Coordinates(4));
        redPoint1D.addProperty(new Color("синего"));
        System.out.println(redPoint1D); //Точка в координате (4), синего цвета

        // 2.Точка в координате 6,7,8 в 11:00
        Point timedPoint3D = new Point();
        timedPoint3D.addProperty(new Coordinates(6, 7, 8));
        timedPoint3D.addProperty(new Timestamp("11:00"));
        System.out.println(timedPoint3D); //Точка в координате (4, 2, 5), в 11:00

        //Сделаем микс из всего
        // 3.Точка в координате 10,10 в 15:35, зеленый цвета
        Point complexPoint2D = new Point();
        complexPoint2D.addProperty(new Coordinates(10, 10));
        complexPoint2D.addProperty(new Timestamp("15:35"));
        complexPoint2D.addProperty(new Color("зеленый"));
        System.out.println(complexPoint2D); //Точка в координате (10, 10), в 15:35, зеленый цвета
    }
}