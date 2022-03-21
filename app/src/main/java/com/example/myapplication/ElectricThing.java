package com.example.myapplication;

public class ElectricThing {
    private String name;
    private int namePrice;
    private int namePercent;
    private int imageThing;

    public ElectricThing(String name, int namePrice, int namePercent, int imageThing) {
        this.name = name;
        this.namePrice = namePrice;
        this.namePercent = namePercent;
        this.imageThing = imageThing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamePrice() {
        return namePrice;
    }

    public void setNamePrice(int namePrice) {
        this.namePrice = namePrice;
    }

    public int getNamePercent() {
        return namePercent;
    }

    public void setNamePercent(int namePercent) {
        this.namePercent = namePercent;
    }

    public int getImageThing() {
        return imageThing;
    }

    public void setImageThing(int imageThing) {
        this.imageThing = imageThing;
    }
}
