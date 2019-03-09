package com.company;

public class Main {

    public static void main(String[] args) {
    //Method overloading means same method name but different parameters
    //Method return type may or may not be different
    //It reduces duplicated code
    //Compiler decides which method is going ot be called based on method name, return type and argument list (compile time polymorphism)
    //We can overload static and instance methods
    //overloading usually happens inside a single class, but a method can also be overloaded in the subclass
    //this is because a subclass inherits one version of the method from the parent and then the subclass can have another overloaded version
    //may have different access modifiers
    //may throw different exceptions

    //method overriding means defining a method in a child class that already exists in the parent class with the same name
    //by extending the parent class the child class gets all methods defined in the parent class
    //it is also known as runtime polymorphism and dynamic method dispatch because the metod is going to be called is decided at runtime by JVM
    //put @Override immediately above the method definition (recommended)
    //we cant override static methods
    //return type can be a subclass of the return type in the parent class (covariant return type) --> can return parent types as well as child types
    //cant have a lower access modifier (must use public in child) but an have a higher access modifier
    //only inherited methods can be overridden
    //constructors and private methods cannot be overridden
    //methods that are final cannot be overriden
    //subclass can use super.methodName() to call the superclass version of an overridden method
    //must not throw a new or broader checked exception
    }
}
