package com.example.aretrusaWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Feedback {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idFeedback;
    private int feedback;
    private int idBook;
    private int idBorrow;

    public Feedback(int idFeedback, int feedback, int idBook, int idBorrow) {
        this.idFeedback = idFeedback;
        this.feedback = feedback;
        this.idBook = idBook;
        this.idBorrow = idBorrow;
    }

    public int getIdFeedback() {
        return idFeedback;
    }

    public int getFeedback() {
        return feedback;
    }

    public int getIdBook() {
        return idBook;
    }

    public int getIdBorrow() {
        return idBorrow;
    }

    public void setIdFeedback(int idFeedback) {
        this.idFeedback = idFeedback;
    }

    public void setFeedback(int feedback) {
        this.feedback = feedback;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public void setIdBorrow(int idBorrow) {
        this.idBorrow = idBorrow;
    }
}
