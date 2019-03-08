package com.company;

public class Animal {
    private String name;
    private int body;
    private int size;
    private int brain;
    private int weight;

    public Animal(String name, int body, int size, int brain, int weight) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.brain = brain;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called.");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed + ".");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
