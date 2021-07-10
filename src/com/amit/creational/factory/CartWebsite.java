package com.amit.creational.factory;

public class CartWebsite extends Website{
    @Override
    public void createWebsite() {
        pages.add(new HomePage("Home Page"));
        pages.add(new AboutPage("About Page"));
        pages.add(new CartPage("Cart Page"));
    }
}
