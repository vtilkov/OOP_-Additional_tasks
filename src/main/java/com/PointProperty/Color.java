package com.PointProperty;

import java.util.Objects;

// Класс для представления цвета точки
public class Color implements PointProperty {
    private final String colorName;

    public Color(String colorName) {
        //Простая валидация
        if (colorName == null || colorName.trim().isEmpty()) {
            throw new IllegalArgumentException("Цвет не может быть пустым");
        }
        this.colorName = colorName.trim().toLowerCase();
    }

    @Override
    public String getInfo() {
        return colorName + " цвета";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return Objects.equals(colorName, color.colorName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(colorName);
    }
}