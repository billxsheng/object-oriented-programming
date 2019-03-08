package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("2", 10000000, "Cliff", "ciff@gmail.com", "4756463636");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String accountNumber, double balance) {
        this(accountNumber, balance, "default", "default@gmail.com", "123");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int fundsAdded) {
        this.balance += fundsAdded;
        System.out.println(fundsAdded + " added. New balance is " + this.balance + ".");
    }

    public void withdraw(int fundsRemoved) {
        if(this.balance < fundsRemoved) {
            System.out.println("Insufficient Funds");
        } else {
            this.balance -= fundsRemoved;
            System.out.println(fundsRemoved + " removed. Remaining balance is " + this.balance + ".");
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
