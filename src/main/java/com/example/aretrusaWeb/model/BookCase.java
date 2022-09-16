package com.example.aretrusaWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class BookCase {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int bookcase;
    private int idAisle;

    public BookCase(int bookcase, int idAisle) {
        this.bookcase = bookcase;
        this.idAisle = idAisle;
    }

    public int getBookcase() {
        return bookcase;
    }

    public int getIdAisle() {
        return idAisle;
    }

    public void setBookcase(int bookcase) {
        this.bookcase = bookcase;
    }

    public void setIdAisle(int idAisle) {
        this.idAisle = idAisle;
    }
}
