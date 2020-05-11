package com.creationalpattern.abstractfactory.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Qual o nome do banco de onde quer pegar o empréstimo: (ICICI, HDFC ,SBI) ");  
		String bankName = br.readLine();
		
		System.out.print("\n");  
		System.out.print("Informe o tipo de emprestimo pessoal, empresarial ou educacao : ");  
		
		String loanName = br.readLine();
		
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);
		
		
		System.out.print("\n");  
		System.out.print("Informe a taxa de juros ".concat(b.getBankName()+ ": "));  
		
		Double rate = Double.parseDouble(br.readLine());
		
		System.out.print("\n");  
		System.out.print("Qual a quantia do emprestimo: ");  
		  
		Double loanAmount = Double.parseDouble(br.readLine());
		
		System.out.print("\n");  
		System.out.print("Em quantos anos pretende pagar: ");  
		
		int years = Integer.parseInt(br.readLine());
		
		System.out.print("\n");  
		System.out.println("Voce pegou o emprestimo em "+ b.getBankName());  
		
		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);

	}

}
