package com.amit.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Registry registry = new Registry();

        Book cpp_book = (Book) registry.createItem("book");
        cpp_book.setName("Lets c++");
        cpp_book.setPrice(303.23f);
        cpp_book.setPages(20);
        cpp_book.setUrl("http://amz.a/asd");

        System.out.println(cpp_book.getName());
    }
}
