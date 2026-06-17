package com.example.mycollections.models;


public class Movie extends LibraryItem {
    private String director;
    private int runTime;

    public Movie(String name, String director, int year, int runTime) {
        super(name, year);
        this.director = director;
        this.runTime = runTime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector() {
        this.director = director;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime() {
        this.runTime = runTime;
    }
}
