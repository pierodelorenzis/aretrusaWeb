package com.example.aretrusaWeb.view;

import com.example.aretrusaWeb.model.Collection;

import java.util.Date;

public class UiCollection {

    public String name;
    public Date startYear;
    public Date endYear;
    public Integer numBooks;

    public UiCollection(Collection collection) {
        this.name = collection.getName();
        this.startYear = collection.getStartYear();
        this.endYear = collection.getEndYear();
        this.numBooks = collection.getNumBooks();
    }

    public UiCollection() {
    }

    public String getName() {
        return name;
    }



    public Date getStartYear() {
        return startYear;
    }



    public Date getEndYear() {
        return endYear;
    }

    public Integer getNumBooks() {
        return numBooks;
    }
}






