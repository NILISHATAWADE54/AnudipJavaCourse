package oops;
import java.util.Scanner;

public class HardwarePurchase2 extends Hardware2 {
public double v;
	

	public double getV() {
		return v;
	}


	public void setV(double v) {
		this.v = v;
	}

	public static void main(String[] args) {
		int ch;
		System.out.println("!!!!!Welcome to Hardware shop!!!!!");
		System.out.println("----------------------------");
		System.out.println("Hardware we have:");
		
		System.out.println("1.CPU");
		System.out.println("2.Monitor");
		System.out.println("3.Speaker");
		System.out.println("4.Keyboard");
		System.out.println("5.Scanner");
		System.out.println("Which product you want to purchase???");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		HardwarePurchase2 HP=new HardwarePurchase2();
		switch(ch)
		{
		case 1:
		{
			HP.setName("CPU");
			System.out.println(HP.getName());
			HP.setDesc("A central processing unit (CPU) is the main component of a computer that carries out instructions and controls other parts of the machine:");
			System.out.println(HP.getDesc());
			HP.setPrice(20000);
			System.out.println(HP.getPrice());
			System.out.println("How many quantity you want");
			HP.setQty(sc.nextInt());
			
			HP.setV(HP.getPrice()*HP.getQty());
			System.out.println("Total amount you have to pay:"+HP.getV());
			break;
		}
		case 2:
		{
			HP.setName("Moniter");
			System.out.println(HP.getName());
			HP.setDesc("it is a electronic device:");
			System.out.println(HP.getDesc());
			HP.setPrice(30000);
			System.out.println(HP.getPrice());
			System.out.println("How many quantity you want");
			HP.setQty(sc.nextInt());
			
			HP.setV(HP.getPrice()*HP.getQty());
			System.out.println("Total amount you have to pay:"+HP.getV());
			break;
		}
		case 3:
		{
			HP.setName("Speaker");
			System.out.println(HP.getName());
			HP.setDesc("it is high volume Speaker:");
			System.out.println(HP.getDesc());
			HP.setPrice(10000);
			System.out.println(HP.getPrice());
			System.out.println("How many quantity you want");
			HP.setQty(sc.nextInt());
			
			HP.setV(HP.getPrice()*HP.getQty());
			System.out.println("Total amount you have to pay:"+HP.getV());
			break;
		}
		case 4:
		{
			HP.setName("Keyboard");
			System.out.println(HP.getName());
			HP.setDesc("it is used for give the command to the moniter!:");
			System.out.println(HP.getDesc());
			HP.setPrice(40000);
			System.out.println(HP.getPrice());
			System.out.println("How many quantity you want");
			HP.setQty(sc.nextInt());
			
			HP.setV(HP.getPrice()*HP.getQty());
			System.out.println("Total amount you have to pay:"+HP.getV());
			break;
		}
		case 5:
		{
			HP.setName("Scanner");
			System.out.println(HP.getName());
			HP.setDesc("this device use to scan something like document,paper etc!");
			System.out.println(HP.getDesc());
			HP.setPrice(20000);
			System.out.println(HP.getPrice());
			System.out.println("How many quantity you want");
			HP.setQty(sc.nextInt());
			
			HP.setV(HP.getPrice()*HP.getQty());
			System.out.println("Total amount you have to pay:"+HP.getV());
			break;
		}
		
		default:
		{
			System.out.println("Sorry the product is not available!");
			break;
		}
		
		}
		System.out.println("Thank you for Purchasing!");

	}

	}
