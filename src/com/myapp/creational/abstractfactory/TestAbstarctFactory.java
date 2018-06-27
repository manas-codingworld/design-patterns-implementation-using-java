package com.myapp.creational.abstractfactory;

public class TestAbstarctFactory {

	public static void main(String[] args) {

		CreditCardFactory creditCardFactory=CreditCardFactory.getCreditCardFactory(850);
		CreditCard creditCard=creditCardFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(creditCard.getClass().getSimpleName());
		
	}

}
