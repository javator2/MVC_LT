package com.sda.mvc.model;

public enum  Fatigue {

    TIRED("tired"), SLEEP("sleep");

    private String title;

    Fatigue(String title) {
        this.title = title;
    }
}
