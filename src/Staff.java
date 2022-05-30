
public abstract class Staff {
	private String name;
	private String id;
	private String designation;
	
	public Staff() {
		super();
	}

	public Staff(String name, String id, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Id: " + id + ", Designation: " + designation + ", ";
	}
	
	public abstract double getSalary();
	public abstract void increaseSalary(double amount);
}
