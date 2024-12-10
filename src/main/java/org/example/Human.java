package org.example;

public class Human implements Swimmable, Flyable{

    String name;
    String classes;
    int age;

    public Human(String name, String classes, int age) {
        this.name = name;
        this.classes = classes;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("I can swim breaststroke");
    }
    @Override
    public void fly() {
        System.out.println("I fly only with the help of air vehicles");
    }
}
