package com.myapp.creational.abstractfactory;

import org.apache.derby.impl.sql.execute.CardinalityCounter;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int cibilScore){
		if(cibilScore>650){
			return new VisaFactory();
		}
		else
			return new AmexFactory();
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
}
