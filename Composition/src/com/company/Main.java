package com.company;

public class Main {

    public static void main(String[] args) {
    //Composition is a has-a relationship
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Resolution resolution = new Resolution(5, 5);
        Case theCase = new Case("220B", "Apple", "240", dimensions);
        Monitor monitor = new Monitor("418A", "Apple", 40, resolution);
        Motherboard motherboard = new Motherboard("418C", "Apple", 5, 10, "idk");
        PC myMac = new PC(theCase, monitor, motherboard);
        myMac.powerUp();
    }
}
