package com.PointProperty;

import java.util.Objects;

// Класс для представления времени появления точки
public class Timestamp implements PointProperty {
    private final String timeValue;

    public Timestamp(String timeValue) {
        if (timeValue == null || timeValue.trim().isEmpty()) {
            throw new IllegalArgumentException("Время не может быть пустым");
        }
        this.timeValue = timeValue.trim();
    }

    @Override
    public String getInfo() {
        return "в " + timeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Timestamp timestamp = (Timestamp) o;
        return Objects.equals(timeValue, timestamp.timeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeValue);
    }
}