package com.myapp.creational.abstractfactory;

public abstract class CreditCard {

	protected int cardNumberLength;
	public int getCardNumberLength() {
		return cardNumberLength;
	}
	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	protected int cvvNumber;
	
}
