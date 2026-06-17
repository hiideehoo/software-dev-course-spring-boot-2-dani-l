package com.example.mycollections.models;

import com.example.mycollections.MycollectionsApplication;

public class LibraryItem {
    public String name;
    private int year;

    public LibraryItem(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

}
