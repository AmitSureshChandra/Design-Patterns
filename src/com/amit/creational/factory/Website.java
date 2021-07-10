package com.amit.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();
    public abstract void createWebsite();

    public Website() {
        createWebsite();
    }

    public void listPages(){
        for (Page p: pages) {
            System.out.println(p.getTitle());
        }
    }
}
