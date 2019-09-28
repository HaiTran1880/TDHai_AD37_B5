package com.example.ad37_tdhai_b5;

import java.io.Serializable;

public class Item implements Serializable {
    String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
