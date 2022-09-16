package com.example.aretrusaWeb.view;

import com.example.aretrusaWeb.model.Genre;

public class UIGenre {

    public String name;

    public UIGenre (){

    }

    public UIGenre(Genre genre ) {
        this.name = genre.getName();
    }

    public String getName() {
        return name;
    }


}
