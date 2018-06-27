package com.myapp.behavioral.template;

public class TestTemplateMethodPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanCalculationAlgorithm houseAlgorithm=new HouseLoanCalculation();
		System.out.println(houseAlgorithm.calculateLoan());
		LoanCalculationAlgorithm personalAlgorithm=new PersonalLoanCalculation();
		System.out.println(personalAlgorithm.calculateLoan());

	}

}
