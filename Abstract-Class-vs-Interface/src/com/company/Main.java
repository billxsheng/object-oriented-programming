package com.company;

public class Main {

    public static void main(String[] args) {
    //-----------------//
    //Abstract Class
    // -----------------//
        //WHAT IS IT
        //similar to interfaces
        //they cannot be instantiated and they may contain a mix of methods declared with or without an implementation
        //however, with abstract classes, yuo can declare fields that are not static and final, and define public protected and private concrete methods
        //a class can extend only one parent class but it can implement multiple interfaces
        //when an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class
            //if it does not then the subclass must also be declared abstract

        //WHEN TO USE IT
        //when you want to share code among several closely related classes
        //you expect classes that extend your abstract class to have many common methods or fields or required acss modifiers
        //you want to declare non static or non final fields... this enables you to define methods that can access and modify the state of an object (getters and setters)
        //when you have a requirement for your base class to provide a default implementation of certain methods but other methods should be open to being overridden by child classes
        //OVERALL, the purpose is to provide a common definition of a base class that multiple derived classes can share

    //-----------------//
    //Interfaces
    // -----------------//
        //WHAT IS IT
        //an interface is just the declaration of methods of a class not the implementation
        //in an interface, we define what kind of operation an object can perform... these are defined by the classes that implement the interface
        //interfaces form a contract between the class and the outside world
        //you cannot instantiate them and they may contain a mix of methods declared with or without an implementation... all methods in interfaces are automatically public and abstract
        //interfaces are more flexible and can deal with a lot more stress on the design of your program than the implementation
        //by introducing interfaces, you are really introducing points of variation at which you can plug in different implementations for that interface... purpose is abstraction, decoupling the what from the how

        //WHEN TO USE IT
        //you expect that unrelated classes will implement your interface
        //for example, the comparable and cloneale interfaces are implemented by many unrelated classes
        //you want to specify the behavior of a particular data type but you are not concerned with who implements its behavior
        //you want to seperate different behavior
        //for example the collections api has the list interface and implementations arraylist and linkedlist
    }
}
