
public class ComissionedStaff extends Staff{
	private double comissionRate;
	private int sales;
	
	public ComissionedStaff() {
		super();
	}

	public ComissionedStaff(String name, String id, String designation, double comissionRate, int sales) {
		super(name, id, designation);
		this.comissionRate = comissionRate;
		this.sales = sales;
	}

	public double getComissionRate() {
		return comissionRate;
	}

	public int getSales() {
		return sales;
	}

	@Override
	public double getSalary() {
		return comissionRate * sales;
	}

	@Override
	public void increaseSalary(double amount) {
		this.comissionRate = this.comissionRate + amount;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Comission Rate: " + comissionRate;
	}
	
	
}
