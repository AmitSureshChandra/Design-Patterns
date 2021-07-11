package com.amit.creational.abstract_factory;

import javax.xml.validation.Validator;

public class AmexFactory extends CreditCardFactory {
    public CreditCard getCreditCard(CreditCardType type){
        switch (type){
            case GOLD:
                return new AmexGold();
            case PLATINUM:
                return new AmexPlatinum();
            default:
                throw new RuntimeException("invalid type");
        }
    }

}
