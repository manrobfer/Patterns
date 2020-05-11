package com.creationalpattern.abstractfactory.pattern;

public abstract class Loan {
	
	protected double rate;
	
	abstract void getInterestRate(double rate);
	
	   
	 public void calculateLoanPayment(double loanamount, int years){
		
		 
		double EMI;
		int n;
		
		n=years*12;
		rate=rate/1200;
		EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate), n))-1))*loanamount;		 
		 
		System.out.println("Seu EMI mensal é" + EMI + "para o emprestimo de "+loanamount+" que voce tomou");
		 
	 }
	

}
