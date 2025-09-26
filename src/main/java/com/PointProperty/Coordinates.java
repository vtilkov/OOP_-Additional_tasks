package com.PointProperty;

import java.util.Objects;

//Класс для представления координат точки в пространстве (1D, 2D или 3D)
public class Coordinates implements PointProperty {
    private final Integer x;
    private final Integer y;
    private final Integer z;

    //конструктор для 1D точки (только X)
    public Coordinates(int x) {
        this(x, null, null);
    }

    //конструктор для 2D точки (X, Y)
    public Coordinates(int x, int y) {
        this(x, y, null);
    }

    //конструктор для 3D точки (X, Y, Z)
    public Coordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Основной приватный конструктор (внутренняя логика)
    private Coordinates(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("в координате (");

        if (x != null) {
            sb.append(x);
            if (y != null) {
                sb.append(", ").append(y);
                if (z != null) {
                    sb.append(", ").append(z);
                }
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y) && Objects.equals(z, that.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}