package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 100, 4, 4, 10,  5, "Blonde");
//        dog.eat();
        dog.walk();
//        dog.run();
    }
}
