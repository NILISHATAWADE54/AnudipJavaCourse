package exceptionhandling;
class CountryNotValidException extends Exception{
	public CountryNotValidException(String message) {
		super(message);
	}
}
class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String message) {
		super(message);
	}
}
class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String message) {
		super(message);
	}
}
class TaxCalculator{
	public double calculateTax(String empName,boolean isIndian,double empSalary)
	throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException{
		if(!isIndian) {
			throw new CountryNotValidException("the employee should be an indian citizen for calculating tax");
		}
		if(empName==null || empName.isEmpty()) {
			throw new EmployeeNameInvalidException("the employee cannot be empty");
		}
		double taxAmt=0;
		if(empSalary>100000) {
			taxAmt=empSalary*8/100;
		}else if(empSalary>=50000 && empSalary<=100000) {
			taxAmt=empSalary*6/100;
		}else if(empSalary>=30000 && empSalary<500000) {
			taxAmt=empSalary*5/100;
		}else if(empSalary>=10000 && empSalary < 300000) {
			taxAmt=empSalary*4/100;
		}else {
			throw new TaxNotEligibleException("the employee does not need to pay tax");
		}
		return taxAmt;
	}
}

public class CalculatorSimulator {

	public static void main(String[] args) {
		TaxCalculator tc= new TaxCalculator();
		try {
			System.out.println(" case1");
			System.out.println("Tax amount is:"+tc.calculateTax("abc",false,34000));
		}
		catch( CountryNotValidException|EmployeeNameInvalidException|TaxNotEligibleException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(" case2");
			System.out.println("Tax amount is:"+tc.calculateTax("dce",true,1000));
		}
		catch( CountryNotValidException|EmployeeNameInvalidException|TaxNotEligibleException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
        }
		try {
			System.out.println(" case3");
			System.out.println("Tax amount is:"+tc.calculateTax("rah",true,55000));
		}
		catch( CountryNotValidException|EmployeeNameInvalidException|TaxNotEligibleException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(" case3");
			System.out.println("Tax amount is:"+tc.calculateTax("rah",true,55000));
		}
		catch( CountryNotValidException|EmployeeNameInvalidException|TaxNotEligibleException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}	
		
}
