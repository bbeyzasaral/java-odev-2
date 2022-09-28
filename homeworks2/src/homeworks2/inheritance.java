package homeworks2;

public class inheritance {

	public static void main(String[] args) {
	Customer customer = new Customer();
	Employee employee=new Employee();
	System.out.println(customer.id);
	System.out.println(employee.salary);
	
	EmployeeManager employeeManager = new EmployeeManager();
	CustomerManagerİnheritance customerManagerİnheritance=new CustomerManagerİnheritance();
	customerManagerİnheritance.liste();
	employeeManager.bestEmployee();
	
	
	
	}

}
