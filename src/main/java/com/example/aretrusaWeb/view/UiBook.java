package com.example.aretrusaWeb.view;

import java.util.Date;

public class UiBook {

    public String name;
    public String isbn;
    public int quantity;
    public String description;
    public Date year;
    public int page;
    public int pegi;
    public float price;
    public float currentPrice;
    public boolean sell;
    public int numBorrow;

    public UiBook() {
    }

    public UiBook(String name, String isbn, int quantity, String description, Date year, int page, int pegi, float price, float currentPrice, boolean sell, int numBorrow) {
        this.name = name;
        this.isbn = isbn;
        this.quantity = quantity;
        this.description = description;
        this.year = year;
        this.page = page;
        this.pegi = pegi;
        this.price = price;
        this.currentPrice = currentPrice;
        this.sell = sell;
        this.numBorrow = numBorrow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public boolean isSell() {
        return sell;
    }

    public void setSell(boolean sell) {
        this.sell = sell;
    }

    public int getNumBorrow() {
        return numBorrow;
    }

    public void setNumBorrow(int numBorrow) {
        this.numBorrow = numBorrow;
    }
}
