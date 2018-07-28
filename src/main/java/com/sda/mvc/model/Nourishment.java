package com.sda.mvc.model;

public enum  Nourishment {

    SATURATED("saturated"), HUNGRY("hungry"), STARVING("starving");

    private String title;

    Nourishment(String title) {
        this.title = title;
    }
}
