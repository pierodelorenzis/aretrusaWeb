package com.example.aretrusaWeb.view;

import com.example.aretrusaWeb.model.Book;

import java.util.Date;

public class UiBook {

    public String name;
    public String isbn;
    public int quantity;
    public String description;
    public int year;
    public int page;
    public int pegi;
    public float price;
    public float currentPrice;
    public boolean sell;
    public int numBorrow;

    public UiBook()
    {

    }

    public UiBook(Book book) {
        this.name = book.getName();
        this.isbn = book.getIsbn();
        this.quantity = book.getQuantity();
        this.description = book.getDescription();
        this.year = book.getYear();
        this.page = book.getPage();
        this.pegi = book.getPegi();
        this.price = book.getPrice();
        this.currentPrice = book.getCurrentPrice();
        this.sell = book.isSell();
        this.numBorrow = book.getNumBorrow();
    }

    public String getName() {
        return name;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getDescription() {
        return description;
    }
    public int getYear() {
        return year;
    }

    public int getPage() {
        return page;
    }
    public int getPegi() {
        return pegi;
    }
    public float getPrice() {
        return price;
    }
    public float getCurrentPrice() {
        return currentPrice;
    }
    public boolean isSell() {
        return sell;
    }
    public int getNumBorrow() {
        return numBorrow;
    }
}
