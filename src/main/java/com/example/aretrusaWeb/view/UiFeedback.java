package com.example.aretrusaWeb.view;

public class UiFeedback {
    public int Feedback;
    public int idBook;
    public int idBorrow;

    public UiFeedback() {
    }

    public UiFeedback(int feedback, int idBook, int idBorrow) {
        Feedback = feedback;
        this.idBook = idBook;
        this.idBorrow = idBorrow;
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
