package com.amit.creational.builder;

public class Main {
    public static void main(String[] args) {
        Font.Builder builder = new Font.Builder();
        builder.text("Hi AMit").size(20).type("Consolas").maxWidth(400);
        Font font = builder.build();
//        this is also be done
//        Font font2 = new Font(builder);

        System.out.println(font.getText());
        System.out.println(font.getType());
        System.out.println(font.getSize());
        System.out.println(font.getMaxWidth());
    }
}
