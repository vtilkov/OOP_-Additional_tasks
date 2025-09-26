package com.PointProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//точка с произвольным набором свойств
public class Point {
    // Коллекция для хранения свойств точки (Полиморфизм: мы храним объекты по их общему интерфейсу)
    private final List<PointProperty> properties;

    public Point() {
        this.properties = new ArrayList<>();
    }

    //Метод для добавления нового свойства к точке (будем вызывать в Main)
    public void addProperty(PointProperty property) {
        if (property != null) {     //проверяем, нет ли уже свойства такого же типа (опционально, усложняет)
            properties.add(property);
        }
    }

    //метод получения описания точки
    public String getDescription() {
        if (properties.isEmpty()) {
            return "Точка без свойств.";
        }

        StringBuilder description = new StringBuilder("Точка ");
        for (int i = 0; i < properties.size(); i++) {
            description.append(properties.get(i).getInfo());
            // Добавляем запятую, если свойство не последнее
            if (i < properties.size() - 1) {
                description.append(", ");
            }
        }
        return description.toString();
    }

    @Override
    public String toString() {
        return getDescription();
    }

    //сравниваем точки (опционально)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        // Простое сравнение: точки равны, если равны их наборы свойств (порядок важен)
        return Objects.equals(properties, point.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }
}