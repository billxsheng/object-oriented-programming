package com.company;

public class Main {

    public static void main(String[] args) {
    //mechanism which allows you to restrict access to certain components in the objects you create
    //protects inner working from unwanted external access

//wrong method

//        Player bill = new Player();
//        bill.name = "bill";
//        bill.health = 20;
//        bill.weapon = "sword";
//
//        int damage = 10;
//        bill.loseHealth(damage);
//        System.out.println("Remaining health = " + bill.healthRemaining());
//
//        damage = 11;
//        bill.health = 200;
//        bill.loseHealth(damage);
//        System.out.println("Remaining health = " + bill.healthRemaining());

//Mutable object is an object where the states and fields can be changed after the object is initialized (StringBuilder)
//Immutable objects cannot be changed after it is created (String)

        EnhancedPlayer player = new EnhancedPlayer("bill", 180, "Sword");
        System.out.println(player.getHitPoints());

    }
}
