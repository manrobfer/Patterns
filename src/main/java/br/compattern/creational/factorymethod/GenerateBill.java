package br.compattern.creational.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[] args) throws IOException {

          GetPlanFactory factory = new GetPlanFactory();
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          System.out.println("Enter the name of the plan to generate bill to");
          String name = br.readLine();

          System.out.println("Enter the amount of units to generate calculated bill ");
          int amount = Integer.parseInt(br.readLine());

          Plan plan = factory.getPlan(name);

          System.out.println("Bill amount for "+ name +" of "+amount + " unit is:");
          plan.getRate();
          plan.calculateBill(amount);


    }
}
