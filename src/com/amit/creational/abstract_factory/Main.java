package com.amit.creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(700);
        CreditCard creditCard = creditCardFactory.getCreditCard(CreditCardType.GOLD);
        System.out.println(creditCard.getClass());

        creditCardFactory = CreditCardFactory.getCreditCardFactory(222);
        creditCard = creditCardFactory.getCreditCard(CreditCardType.PLATINUM);
        System.out.println(creditCard.getClass());
    }
}
