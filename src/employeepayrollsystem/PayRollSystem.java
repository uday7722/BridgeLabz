package employeepayrollsystem;

public class PayRollSystem {
	
	public static void main(String[] args) {
		
		Employee employee1=new Employee(1,"Uday",30000);
		Employee employee2=new Employee(2,"Umar",40000);
		Employee employee3=new Employee(3,"Vinod",50000);
		
		double bounus=0.5;
		double tax=0.10;
		
		Employee[] employees= {employee1,employee2,employee3};
		
		for(Employee employee:employees) {
			
			employee.setName("Dinesh");
			employee.setSalary(employee.getSalary()+bounus*employee.getSalary()-tax*employee.getSalary());
			
			employee.displayEmployees();
			System.out.println("-------");
		}
		
	}

}
