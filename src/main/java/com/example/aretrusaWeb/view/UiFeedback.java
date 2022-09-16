package com.example.aretrusaWeb.view;

import com.example.aretrusaWeb.model.Feedback;

public class UiFeedback {
    public int feedback;


    public UiFeedback(Feedback feedback) {
        this.feedback=feedback.getFeedback();
    }

    public int getFeedback() {
        return feedback;
    }

}
