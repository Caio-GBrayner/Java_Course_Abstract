package entities;

public class NaturalPerson extends Person {
	public double healthExpenses;
	
	public NaturalPerson() {
	}
	
	public NaturalPerson(String name, double annualIncome, double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double taxCalculations() {
		return (annualIncome *0.25) - (healthExpenses*0.5);
	}

}
