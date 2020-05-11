package com.creationalpattern.abstractfactory.pattern;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
	
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
	    
		if(loan == null) {
			
			return null;
		}		
		else if(loan.equalsIgnoreCase("Pessoal")) {
			return new HomeLoad();
		}
		else if(loan.equalsIgnoreCase("Empresarial")) {
			return new BusinessLoad();
		}
		else if(loan.equalsIgnoreCase("Educação")) {
			return new EducationLoan();
		}
		
		
		
		return null;
	}

}
