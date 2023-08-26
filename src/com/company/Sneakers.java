package com.company;

public class Sneakers extends Clothes{
    private String season;

    public Sneakers(){

    }
    public Sneakers(String model, int price, int count, int sold, String size, String color, boolean isKid, boolean isMan, String season) {
        super(model, price, count, sold, size, color, isKid, isMan);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public void showDetails() {
        System.out.println("Sneakers: " + getModel() + " " + getPrice() + " " + getSize() + " " + getColor() + " " + season);
    }
}

