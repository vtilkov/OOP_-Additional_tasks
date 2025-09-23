package ru.bird.parrot;

import ru.bird.bird.*;
import java.util.Random;

public class Parrot extends Bird {
    private String text;
    private Random random;

    public Parrot(String text) {
        super("Попугай");
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Попугаю нужен текст для пения!");
        }
        this.text = text;
        this.random = new Random();
    }

    @Override
    public void sing() {
        if (text.length() == 1) {
            System.out.println(text);
        } else {
            int n = random.nextInt(text.length()) + 1; // от 1 до длины текста
            System.out.println(text.substring(0, n));
        }
    }

    public String getText() {
        return text;
    }
}