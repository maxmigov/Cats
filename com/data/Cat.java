package com.data;

public class Cat implements FelineInterface {
    String name;
    String race;
    int year;

    public Cat(String race){
        this.race = race;
    }
    public Cat(int year){
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
