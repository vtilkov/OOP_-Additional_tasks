package ru;

abstract class Bird {
    protected String name;

    public Bird(String name) {
        this.name = name;
    }

    // Абстрактный метод пения - должен быть реализован в дочерних классах
    public abstract void sing();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Птица= " + name;
    }
}
