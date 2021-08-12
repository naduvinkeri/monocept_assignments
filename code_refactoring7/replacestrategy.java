public class ReplaceConditionalWithStrategy {

	public static void main(String[] args){
		
		Employee salesman = new Salesman(15000.00);
		
		Employee secretary = new Secretary(25000.00);
		
		System.out.println("Salesman Pay: $" + salesman.getPay());
		System.out.println("Secretary Pay: $" + secretary.getPay());
		
		salesman.setBonusOption(new GetsBonus());
		
		System.out.println("Salesman's New Pay: $" + salesman.getPay());
		
		Employee salesTrainee = new Salesman(15000.00, new NoBonus());
		
		System.out.println("Sales Trainee Pay: $" + salesTrainee.getPay());
		
		secretary.setBonusOption(new GetsBonus());
		
		System.out.println("Secretary Pay: $" + secretary.getPay());
		
	}
	
	
}

class Employee{
	
	protected double salary = 0.0;
	
	public Pay payType = new NoBonus();
	
	Employee(double salary){
		
		this.salary = salary;
		
	}
	
	Employee(double salary, Pay payType) {
		this.salary = salary;
		this.payType = payType;
	}
	
	public void setBonusOption(Pay newPayType){
		
		payType = newPayType;
		
	}
	
	public double getPay(){
		
		return payType.getPay(this.salary);
		
	}
	
}

interface Pay{
	
	double getPay(double salary);
	
}

class GetsBonus implements Pay{

	public double getPay(double salary) {
		return salary + (salary * .15);
	}
	
}

class NoBonus implements Pay{
	
	public double getPay(double salary) {
		return salary;
	}
	
}

class Bonus20Per implements Pay{
	
	public double getPay(double salary) {
		return salary + (salary * .20);
	}
	
}

class Salesman extends Employee{

	Salesman(double salary) {
		super(salary);
	}

	public Salesman(double salary, Pay payType) {
		
		super(salary);
		setBonusOption(payType);
		
	}

}

class Secretary extends Employee{

	Secretary(double salary) {
		super(salary);
	}
	
	Secretary(double salary, Pay payType) {
		
		super(salary);
		setBonusOption(payType);
		
	}
	
}
