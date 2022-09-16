package com.example.aretrusaWeb.model;

import javax.persistence.Id;

public class Aisle {
    @Id
    private int aisle;


    public Aisle(int aisle) {
        this.aisle = aisle;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }
}
