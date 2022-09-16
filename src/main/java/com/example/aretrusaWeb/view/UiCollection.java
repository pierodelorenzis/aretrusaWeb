package com.example.aretrusaWeb.view;

import java.util.Date;

public class UiCollection {

    public String name;
    public Date startYear;
    public Date endYear;
    public Integer numBooks;

    public UiCollection(String name, Date startYear, Date endYear, Integer numBooks) {
        this.name = name;
        this.startYear = startYear;
        this.endYear = endYear;
        this.numBooks = numBooks;
    }

    public UiCollection (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartYear() {
        return startYear;
    }

    public void setStartYear(Date startYear) {
        this.startYear = startYear;
    }

    public Date getEndYear() {
        return endYear;
    }

    public void setEndYear(Date endYear) {
        this.endYear = endYear;
    }

    public Integer getNumBooks() {
        return numBooks;
    }

    public void setNumBooks(Integer numBooks) {
        this.numBooks = numBooks;
    }
}
