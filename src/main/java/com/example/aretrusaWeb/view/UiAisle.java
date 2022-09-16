package com.example.aretrusaWeb.view;

import com.example.aretrusaWeb.model.Aisle;

public class UiAisle {

    public int aisle;


    public UiAisle(Aisle aisle) {
        this.aisle = aisle.getAisle();
    }

    public int getAisle() {
        return aisle;
    }

}
