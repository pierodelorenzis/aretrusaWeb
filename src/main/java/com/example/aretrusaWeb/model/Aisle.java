package com.example.aretrusaWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Aisle {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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
