package com.company;
//interface specifies methods that a class that implements this interface must implement
//interface is abstract you provide the method name and parameters
//provides common behaviour that can be used by several classes

public class Main {

    public static void main(String[] args) {
        ITelephone billsPhone;
        billsPhone = new DeskPhone(1234567890);
        billsPhone.powerOn();
        billsPhone.callPhone(7654321);
        billsPhone.answer();

        //both classes implement the same interface so billsPhone variable can be changed
        billsPhone = new MobilePhone(1234567890);
        billsPhone.callPhone(1234);
        billsPhone.answer();

    }
}
