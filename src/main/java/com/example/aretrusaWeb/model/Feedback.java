package com.example.aretrusaWeb.model;

import javax.persistence.Id;

public class Feedback {
    @Id
    private int idFeedback;
    private int Feedback;
    private int idBook;
    private int idBorrow;

    public Feedback(int idFeedback, int feedback, int idBook, int idBorrow) {
        this.idFeedback = idFeedback;
        Feedback = feedback;
        this.idBook = idBook;
        this.idBorrow = idBorrow;
    }

    public int getIdFeedback() {
        return idFeedback;
    }

    public int getFeedback() {
        return Feedback;
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
        Feedback = feedback;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public void setIdBorrow(int idBorrow) {
        this.idBorrow = idBorrow;
    }
}
