package ru.bird;

import ru.bird.sparrow.Sparrow;
import ru.bird.parrot.Parrot;
import ru.bird.cuckoo.Cuckoo;

public class Main {
    public static void main(String[] args) {

        Sparrow sparrow1 = new Sparrow();
        Sparrow sparrow2 = new Sparrow();

        Parrot parrot1 = new Parrot("шщшщшщшщшр");
        Parrot parrot2 = new Parrot("аоткттктао");
        Parrot parrot3 = new Parrot("пршшшшошфо");

        Cuckoo cuckoo1 = new Cuckoo();
        Cuckoo cuckoo2 = new Cuckoo();

        System.out.println(" -- Начнем Хор (аппладисменты) -- ");
        BirdChoir.performBirdConcert(
                cuckoo2,
                parrot3,
                new Parrot("аоткттктао"), //Попугай не в составе хора (залетный)
                parrot1,
                new Sparrow()
        );

        /*
        Sparrow sparrow = new Sparrow();
        System.out.println("Воробей:");
        sparrow.sing();

        Parrot parrot = new Parrot("Прилетаю я как-то на Таити...");
        System.out.println("\nПопугай с текстом 'Прилетаю я как-то на Таити...':");
        parrot.sing();

        Cuckoo cuckoo = new Cuckoo();
        System.out.println("\nКукушка:");
        cuckoo.sing();*/
    }
}