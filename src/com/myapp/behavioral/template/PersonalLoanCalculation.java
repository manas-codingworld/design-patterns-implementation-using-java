package com.myapp.behavioral.template;

public class PersonalLoanCalculation extends LoanCalculationAlgorithm {

	@Override
	public int getBaseAmount() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public int calculateDiscount() {
		// TODO Auto-generated method stub
		return 100;
	}

}
