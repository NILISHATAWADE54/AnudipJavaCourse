package prac2;

public class BankCus {
	private int acno;
	private String atype;
	private double amt;
	public BankCus(int acno,String atype,double amt) {
		this.acno =acno;
		this.atype =atype;
		this.amt=amt;
	}
	public void displayAccountDetails() {
		System.out.println("AccountNumber:"+acno);
		System.out.println("AccountType:"+atype);
		System.out.println("Amount:"+amt);
	}

	public static void main(String[] args) {
		BankCus acc1=new BankCus(11,"Esha Gupta",12345);
		BankCus acc2=new BankCus(12,"acb",5678);
		BankCus acc3=new BankCus(13,"ery",9876);
		BankCus acc4=new BankCus(14,"you",9087);
		BankCus acc5=new BankCus(15,"thy",8900);
		acc1.displayAccountDetails();
		acc2.displayAccountDetails();
		acc3.displayAccountDetails();
		acc4.displayAccountDetails();
		acc5.displayAccountDetails();
		

	}

}
