package employeepayrollsystem;

public class Employee {
	
	protected int id;
	public String name;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void displayEmployees() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary: "+salary);
	}
	
	

}
