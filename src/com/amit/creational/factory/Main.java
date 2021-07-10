package com.amit.creational.factory;

public class Main {
    public static void main(String[] args) {
        Website website = WebsiteFactory.getInstance(WebsiteType.CART);
        website.listPages();
    }
}
