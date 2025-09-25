package ru.bird;

import ru.bird.bird.Bird;

public class BirdChoir {

    public static void performBirdConcert(Bird... birds) {
        if (birds == null || birds.length == 0) {
            System.out.println("В концертном зале сегодня нет птиц)");
            return;
        }

        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i].getName() + " исполняет:");
            birds[i].sing();
            System.out.println("---");
        }
    }
}