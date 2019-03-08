package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount cliff = new BankAccount();
        System.out.println(cliff.getBalance());
        BankAccount bill = new BankAccount("1", 1000000, "Bill", "billxsheng@gmail.com", "4168475756");
        bill.deposit(10);
        bill.withdraw(5);
        bill.withdraw(15);
    }
}
