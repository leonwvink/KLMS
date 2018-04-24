package com.capgemini.KLMS_SPRINGBOOT.model;

public abstract class NamedItem {
    String name;

    public NamedItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
