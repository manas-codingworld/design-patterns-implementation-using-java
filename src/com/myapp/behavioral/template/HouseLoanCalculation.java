package com.myapp.behavioral.template;

public class HouseLoanCalculation extends LoanCalculationAlgorithm {

	@Override
	public int getBaseAmount() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int calculateDiscount() {
		// TODO Auto-generated method stub
		return 50;
	}

}
