package com.example.aretrusaWeb.view;

import java.util.Date;

public class UiBorrow {

    public Date startDate;
    public Date endDate;
    public Date startReservation;
    public Date endReservation;

    public UiBorrow() {
    }

    public UiBorrow(Date startDate, Date endDate, Date startReservation, Date endReservation) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.startReservation = startReservation;
        this.endReservation = endReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartReservation() {
        return startReservation;
    }

    public void setStartReservation(Date startReservation) {
        this.startReservation = startReservation;
    }

    public Date getEndReservation() {
        return endReservation;
    }

    public void setEndReservation(Date endReservation) {
        this.endReservation = endReservation;
    }
}
