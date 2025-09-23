package com.calculator.raising;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class PowerCalculator {
    public static double calculatePower(String xStr, String yStr) {

        int x = parseInt(xStr); //преобразования строки в число следует использовать метод Integer.parseInt
        int y = parseInt(yStr); //преобразования строки в число следует использовать метод Integer.parseInt

        return pow(x, y); //возводим в степень
    }

    public static void main(String[] args) {

        double result = calculatePower(args[0], args[1]); //вызываем метод с параметрами

        System.out.println(args[0] + " в степени " + args[1] + " = " + result); //результат
    }
}