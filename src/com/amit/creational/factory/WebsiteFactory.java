package com.amit.creational.factory;

public class WebsiteFactory {
    public static Website getInstance(WebsiteType type){
        switch (type){
            case BLOG:
                return new BlogWebsite();
            case CART:
                return new CartWebsite();
            default:
                return null;
        }
    }
}
