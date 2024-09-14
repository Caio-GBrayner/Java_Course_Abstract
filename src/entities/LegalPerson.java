package entities;

public class LegalPerson extends Person {
	
	private int NumberOfEmployee;
	
	public LegalPerson() {
	}
	
	public LegalPerson(String name, double annualIncome, int numberOfEmployee) {
		super(name, annualIncome);
		NumberOfEmployee = numberOfEmployee;
	}
	
	public int getNumberOfEmployee() {
		return NumberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		NumberOfEmployee = numberOfEmployee;
	}

	@Override
	public double taxCalculations() {
		if(NumberOfEmployee >= 10) {
			return annualIncome *0.14;
		}
		else {
			return annualIncome * 0.16;
		}
	}

}
