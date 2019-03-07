package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        //this refers to the field of the class instance the method is called upon
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
