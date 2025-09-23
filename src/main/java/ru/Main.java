package ru;

public class Main {
    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        System.out.println("Воробей:");
        sparrow.sing();

        Parrot parrot = new Parrot("Прилетаю я как-то на Таити...");
        System.out.println("\nПопугай с текстом 'Прилетаю я как-то на Таити...':");
        parrot.sing();

        Cuckoo cuckoo = new Cuckoo();
        System.out.println("\nКукушка:");
        cuckoo.sing();
    }
}