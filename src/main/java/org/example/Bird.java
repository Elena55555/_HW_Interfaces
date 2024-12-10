package org.example;

public class Bird implements Swimmable, Flyable{

    String name;
    String classes;
    int age;

    public Bird(String name, String classes, int age) {
        this.name = name;
        this.classes = classes;
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println("I'm great at flying in the air");

    }


    @Override
    public void swim() {
        System.out.println("I swim on the surface of the water");

    }
}
