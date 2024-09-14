package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Ente the number of tax payers:");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++) {
			System.out.print("Individual or Company(i/c)");
			char individualOrCompany = sc.nextLine().charAt(0);
			
			if(individualOrCompany == 'i') {
				
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Annual Income:");
				double annualIncome = sc.nextDouble();
				System.out.print("Health expenditures:");
				double healthExpenditures = sc.nextDouble();
				
				sc.nextLine();
				
				Person person = new NaturalPerson(name, annualIncome, healthExpenditures);
				
				list.add(person);
			}
			else {
				
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Annual Income:");
				double annualIncome = sc.nextDouble();
				System.out.print("Number of employees:");
				int NumberOfEmployee = sc.nextInt();
				
				sc.nextLine();
				
				Person person = new LegalPerson(name, annualIncome, NumberOfEmployee);
				
				list.add(person);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(Person p: list) {
			System.out.println(p.getName()+ ": " + String.format("%.2f", p.taxCalculations()));
		}
		double sum = 0;
		for(Person p: list) {
			sum += p.taxCalculations();
		}
		System.out.println("TOTAL TAX: $" + sum);
		sc.close();
	}

}
