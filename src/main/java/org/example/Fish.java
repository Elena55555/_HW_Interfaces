package org.example;

public class Fish implements Swimmable{

    String name;
    String classes;
    int age;

    public Fish(String name, String classes, int age) {
        this.name = name;
        this.classes = classes;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("I swim great in the water");
    }
}
