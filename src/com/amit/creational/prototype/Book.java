package com.amit.creational.prototype;

public class Book extends Item{
    private Integer pages;

    public Book(String name, String url, Float price) {
        super(name, url, price);
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
