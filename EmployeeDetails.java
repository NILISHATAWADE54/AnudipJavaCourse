package pracatice;
class Employee{
	private String name;
	private double salary;
	private int age;
	
	public Employee(String name,double salary,int age) {
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
		public void displayEmployeeDetails() {
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Age:"+age);
		System.out.println("---------------");
		}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		

		Employee emp1=new Employee("Abc",5000,22);
		Employee emp2=new Employee("Ab",52000,21);
		Employee emp3=new Employee("Ac",53000,20);
		Employee emp4=new Employee("Abc",55000,28);
		Employee emp5=new Employee("Adc",54000,29);
		Employee emp6=new Employee("Abc",51000,26);
		Employee emp7=new Employee("Aec",15000,25);
		
		
		System.out.println("employee details:");
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		emp3.displayEmployeeDetails();
		emp4.displayEmployeeDetails();
		emp5.displayEmployeeDetails();
		emp6.displayEmployeeDetails();
		emp7.displayEmployeeDetails();
		
		
		
		
	}

}
