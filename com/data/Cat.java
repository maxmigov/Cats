package com.data;

public class Cat implements FelineInterface {
    String name;
    String race;
    int year;
    Integer id;

    public Cat(String name, String race, int year, Integer id) {
        this.name = name;
        this.race = race;
        this.year = year;
        this.id = id;
    }

    public Cat(String name, String race, int year) {
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRace() {
        return race;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        FelineInterface feline = (FelineInterface) super.clone();
        feline.setName(this.name);
        feline.setRace(this.race);
        feline.setYear(this.year);
        return feline;
    }

    @Override
    public String toString() {
        return "Cat { " +
                "name = '" + name + '\'' +
                ", race = '" + race + '\'' +
                ", year = " + year +
                '}';
    }
}
