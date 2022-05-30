
public class PaidStaff extends Staff{
	private double monthlySalary;

	public PaidStaff() {
		super();
	}

	public PaidStaff(String name, String id, String designation, double monthlySalary) {
		super(name, id, designation);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double getSalary() {
		return monthlySalary;
	}

	@Override
	public void increaseSalary(double amount) {
		this.monthlySalary = this.monthlySalary + amount;
	}

	@Override
	public String toString() {
		return super.toString() + "Monthly Salary: " + monthlySalary;
	}
	
	
}
