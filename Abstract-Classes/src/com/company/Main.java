package com.company;

//abstraction is when you define the required functionality without implementing the details
//what needs to be done not how
//interfaces are abstract
//abstract classes cannot be instantiated
//solves multiple inheritance which is not a good practice


public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("corgi");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("tom");
        parrot.fly();

        Penguin penguin = new Penguin("jack");
        penguin.fly();
    }
}
