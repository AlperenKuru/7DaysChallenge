package com.example.challenge16mar.model;

public class JsonItem {

    private final String name;
    private final String clicked;

    public JsonItem(String name, String clicked) {
        this.name = name;
        this.clicked = clicked;
    }

    public String getName() {
        return name;
    }

    public String getClicked() {
        return clicked;
    }
}
