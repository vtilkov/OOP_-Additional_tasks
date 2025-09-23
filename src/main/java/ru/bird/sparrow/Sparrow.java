package ru.bird.sparrow;

import ru.bird.bird.Bird;

public class Sparrow extends Bird {
    public Sparrow() {
        super("Воробей");
    }

    public void sing(){
        System.out.println("чырык");
    }
}