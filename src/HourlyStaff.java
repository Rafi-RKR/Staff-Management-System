
public class HourlyStaff extends Staff {
	private int hours;
	private double hourlyRate;
	
	public HourlyStaff() {
		super();
	}

	public HourlyStaff(String name, String id, String designation, int hours, double hourlyRate) {
		super(name, id, designation);
		this.hours = hours;
		this.hourlyRate = hourlyRate;
	}
	
	public int getHours() {
		return hours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	@Override
	public double getSalary() {
		return hourlyRate * hours;
	}

	@Override
	public void increaseSalary(double amount) {
		this.hourlyRate = this.hourlyRate + amount;	
	}
	
	@Override
	public String toString() {
		return super.toString() + "Hourly Rate: " + hourlyRate;
	}
	
	
}
