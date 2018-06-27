package com.myapp.behavioral.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		
		CreditCard amexCard=new CreditCard();
		amexCard.setNumber("378645671289678");
		amexCard.setCvv("234");
		amexCard.setDate("04/2020");
		amexCard.setValidationStrategy(new AmexStrategy());
		System.out.println("Is valid "+amexCard.isValid());
		
		CreditCard visaCard=new CreditCard();
		visaCard.setNumber("4893771200486932");
		visaCard.setCvv("234");
		visaCard.setDate("04/2020");
		visaCard.setValidationStrategy(new VisaStrategy());
		System.out.println("Is valid "+visaCard.isValid());
		
		
		Chess chess=new Chess();
		System.out.println("Next step:"+chess.calculateNextStep());
		chess.setAlgorithm(new ModerateChessAlgorithm());
		System.out.println("Next step:"+chess.calculateNextStep());
		chess.setAlgorithm(new DifficultChessAlgorithm());
		System.out.println("Next step:"+chess.calculateNextStep());
				
	}

}
