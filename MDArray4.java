package array;
import java.util.Scanner;

public class MDArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter Array Element size :");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int num2=sc.nextInt();
      
      System.out.println("enter the array elements:");
      
      int md[][]=new int[num][num2];
      
      for(int i=0;i<num;i++) {
    	  for(int j=0;j<num2;j++) {
    		  md[i][j]=sc.nextInt();
    		  
    	  }
      }
      System.out.println("\n Data you entered:\n");
      for(int[]x:md) {
    	  for(int y:x) {
    		  System.out.print(y+"   ");
    	  }
    	  System.out.println();
      }
      
	}

}
