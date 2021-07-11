package com.amit.creational.abstract_factory;

import javax.xml.validation.Validator;

public class VisaFactory extends CreditCardFactory {
    public CreditCard getCreditCard(CreditCardType type){
        switch (type){
            case GOLD:
                return new VisaGoldCredit();
            case PLATINUM:
                return new VisaPlatinum();
            default:
                throw new RuntimeException("invalid type");
        }
    }


}
