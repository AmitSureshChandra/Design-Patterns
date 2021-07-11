package com.amit.creational.abstract_factory;

public abstract class CreditCard {
    protected Integer cardNumberLength;
    protected Integer cscNumber;

    public Integer getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(Integer cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public Integer getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(Integer cscNumber) {
        this.cscNumber = cscNumber;
    }
}
