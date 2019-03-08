package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //super allows us to call the constructor we are inheriting from
        super(name, 1, size, 1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called.");

    }

    //Overriding method in the parent/super class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called.");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called.");
        //Not calling super means that it will look in the child first then the parent class for a move() method.
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called. Animal legs are moving at " + speed + ".");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(5);
        super.move(speed);
    }
}
