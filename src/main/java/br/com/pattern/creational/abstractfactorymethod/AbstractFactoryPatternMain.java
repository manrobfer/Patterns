package br.com.pattern.creational.abstractfactorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternMain {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of Bank to take loan amount: ");
        String bankName = reader.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan like home loan or business loan or education loan ");
        String loanName = reader.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);

        System.out.print("\n");
        System.out.print("Enter the interest rate for "+bank.getBankName()+ ": ");
        double rate = Double.parseDouble(reader.readLine());

        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");
        Double loanAmount = Double.parseDouble(reader.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ bank.getBankName());

        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(reader.readLine());


        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
       Loan loan = loanFactory.getLoan(loanName);
       loan.getInterestRate(rate);
       loan.calculateLoanPayment(loanAmount,years);



    }
}
