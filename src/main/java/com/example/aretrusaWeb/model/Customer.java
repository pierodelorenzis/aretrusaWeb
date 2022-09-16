package com.example.aretrusaWeb.model;

public class Customer {

    private float balance;
    private int bookLost;
    private int bookDelay;
    private int bookDamage;
    private int evaluation;

    public Customer() {
    }

    public Customer(float balance, int bookLost, int bookDelay, int bookDamage, int evaluation) {
        this.balance = balance;
        this.bookLost = bookLost;
        this.bookDelay = bookDelay;
        this.bookDamage = bookDamage;
        this.evaluation = evaluation;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getBookLost() {
        return bookLost;
    }

    public void setBookLost(int bookLost) {
        this.bookLost = bookLost;
    }

    public int getBookDelay() {
        return bookDelay;
    }

    public void setBookDelay(int bookDelay) {
        this.bookDelay = bookDelay;
    }

    public int getBookDamage() {
        return bookDamage;
    }

    public void setBookDamage(int bookDamage) {
        this.bookDamage = bookDamage;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "balance=" + balance +
                ", bookLost=" + bookLost +
                ", bookDelay=" + bookDelay +
                ", bookDamage=" + bookDamage +
                ", evaluation=" + evaluation +
                '}';
    }
}
