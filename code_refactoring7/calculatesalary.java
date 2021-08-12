public class CalculateSalary {
	
	public static void main(String[] args){
		
		Employees salesman = new Employees(15000.00, true);
		
		System.out.println(salesman.getSalary());
		
		Employees secretary = new Employees(20000.00, false);
		
		System.out.println(secretary.getSalary());
		
	}

}

class Employees{
	
	private boolean bonus = false;
	private double salary = 0.0;
	
	private double bonusAmount = .15;
	
	public Employees(double salary, boolean bonus, double bonusAmount) {
		super();
		this.salary = salary;
		this.bonus = bonus;
		this.bonusAmount = bonusAmount;
	}
	
	public Employees(double salary, boolean bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}

	public Employees() {}

	public double getSalary() {
		
		if(bonus){
			
			return salary + (salary*bonusAmount);
			
		}
		
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}