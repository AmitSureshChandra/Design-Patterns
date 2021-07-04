package com.amit.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<String, Item> items = new HashMap<>();

    Registry(){
        loadRegistry();
    }

    public Item createItem(String itemType){
        return items.get(itemType).clone();
    }

    public void loadRegistry(){
        Book item = new Book("Lets C++", "http://amzby/srt",  30.05f);
        items.put("book", item);
    }
}
