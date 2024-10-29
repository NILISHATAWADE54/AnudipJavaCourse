package pracatice;
import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Name:");
		String name=sc.nextLine();
		int[] marks = new int[5];
		int total=0;
		for(int i=0;i<5;i++) {
			System.out.print("Enter marks for Subject"+(i+1)+":");
			marks[i]=sc.nextInt();
			total += marks[i];
		}
		double average = total /5.0;
		
		char grade;
		if(average >= 90) {
			grade='A';
		}else if(average >=80) {
			grade='B';
		}else if(average >=70) {
			grade ='C';
		}else if(average >=60) {
			grade ='D';
		}else {
			grade='F';
		}
		System.out.println("\n Student Name:"+name);
		System.out.println("\n Total Marks:" +total);
		System.out.println("\n Average Marks:"+average);
		System.out.println("\n Grade:"+grade);
		}

}
