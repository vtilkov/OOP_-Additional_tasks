package ru.bird.cuckoo;

import ru.bird.bird.*;
import java.util.Random;

public class Cuckoo extends Bird {
    private Random random;

    public Cuckoo() {
        super("Кукушка");
        this.random = new Random();
    }

    public void sing(){
        int count = random.nextInt(10);
        for (int i=0 ; i<count; i++){ //кукуем))
            System.out.println("ку-ку");
        }
        System.out.println("\n");
    }
}