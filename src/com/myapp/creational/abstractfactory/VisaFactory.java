package com.myapp.creational.abstractfactory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		// TODO Auto-generated method stub
		switch(cardType){
		case GOLD:
			return new VisaGoldCreditCard();
		case PLATINUM:
			return new VisaPlatinumCreditCard();
		default:
			break;
		}
		return null;
	}

}
