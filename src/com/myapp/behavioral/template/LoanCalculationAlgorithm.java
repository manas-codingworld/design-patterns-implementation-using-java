package com.myapp.behavioral.template;

public abstract class LoanCalculationAlgorithm {
	public abstract int getBaseAmount();
	
	public abstract double getInterest();
	
	public abstract int calculateDiscount();
	
	public int calculateLoan(){
		return(int)(getBaseAmount()*getInterest()-calculateDiscount());
	}
}
