package prac2;

public class Emp {
	private int empid;
	 private String empname;
    private static String compName;
    
    public Emp(int empid,String empname) {
    	this.empid=empid;
    	this.empname=empname;
    }
    public  static void SetCompanyName(String cName) {
    	compName=cName;
    }
    public void display() {
    	System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Company Name: " + compName);

    }
public static void main(String[] args) {
		Emp.SetCompanyName("tcs");
		Emp emp1 = new Emp(101, "Alice");
	    Emp emp2 = new Emp(102, "Bob");
	    Emp emp3 = new Emp(101, "nil");
        Emp emp4 = new Emp(102, "mahi");
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
	}

}
