package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Human");
        Human human = new Human("Noah", "Mammals", 14);
        human.swim();
        human.fly();
        System.out.println(" ");

        System.out.println("Fish");
        Fish fish = new Fish("Liam", "Vertabrate animals", 1);
        fish.swim();
        System.out.println(" ");

        System.out.println("Bird");
        Bird bird = new Bird("William", "Warm-blooded oviparous vertebrates", 1);
        bird.fly();
        System.out.println(" ");




    }
}