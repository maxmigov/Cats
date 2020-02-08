package com.data;

public class Cat implements FelineInterface {
    private String name;
    private String race;
    private int year;

    public Cat(String name, String race, int year){
        this.name = name;
        this.race = race;
        this.year = year;
    }


    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setRace(String race) {

    }

    @Override
    public String getRace() {
        return null;
    }

    @Override
    public void setYear(int year) {

    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public String toString() {
        return "Name" + name
                + "Race" + race
                + "Year" + year;
    }
}
