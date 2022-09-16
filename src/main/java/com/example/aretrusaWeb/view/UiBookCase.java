package com.example.aretrusaWeb.view;

import com.example.aretrusaWeb.model.BookCase;

public class UiBookCase {

    public int bookcase;

    public UiBookCase(BookCase bookCase) {
        this.bookcase = bookCase.getBookcase();
    }

    public UiBookCase() {
    }

    public int getBookcase() {
        return bookcase;
    }

}

