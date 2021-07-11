package com.amit.creational.abstract_factory;

import javax.xml.validation.Validator;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int score){
        if (score >  650){
            return new AmexFactory();
        }

        return new VisaFactory();
    }

    public abstract CreditCard getCreditCard(CreditCardType type);

}
