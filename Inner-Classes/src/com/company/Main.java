package com.company;
//possible to nest a class inside another class
//four types --> static nested classes, inner/non-static nested class, local class, anonymous class
//local classes are declared inside a block (method or if statement)
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("print");

    public static void main(String[] args) {
        //-------------------------//
        //non-static/inner nested class
        //-------------------------//

        Gearbox benz = new Gearbox(6);
//        You need to declare an outer class before you declare an inner class
//        benz.addGear(1, 5.3);
//        benz.addGear(2, 10.6);
//        benz.addGear(3, 15.9);
        benz.operateClutch(true);
        benz.changeGear(1);
        benz.operateClutch(false);
        System.out.println(benz.wheelSpeed(1000));
        benz.changeGear(2);
        System.out.println(benz.wheelSpeed(3000));
        benz.operateClutch(true);
        benz.changeGear(3);
        benz.operateClutch(false);
        System.out.println(benz.wheelSpeed(6000));

        //-------------------------//
        //local classes
        //-------------------------//
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");

            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();

        //-------------------------//
        //anonymous classes
        //used is local class with no name
        //used when local class is required only once
        //-------------------------//
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1: btnPrint.onClick();
            }
        }
    }
}
