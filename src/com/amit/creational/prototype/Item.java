package com.amit.creational.prototype;

public class Item implements Cloneable{

    private String name;
    private String url;
    private Float price;

    public Item(String name, String url, Float price) {
        this.name = name;
        this.url = url;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Item clone() {
        try {
            return (Item)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
