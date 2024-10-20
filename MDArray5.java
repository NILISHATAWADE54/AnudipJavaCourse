package array;
import java.util.Arrays;

public class MDArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] originalArray= {
        		{1,2,3},
        		{4,5,6},
        		{7,8,9}
        };
        int[][]copyArray=new int[originalArray.length][];
        for(int i=0;i<originalArray.length;i++) {
        	copyArray[i]=originalArray[i].clone();
        }
        System.out.println("Original Array");
        printArray(originalArray);
        System.out.println("\n Copy Array");
        printArray(copyArray);
        
       
	}
	 public static void printArray(int [][] array)
 	{
 		for(int[] row:array) {
 			System.out.println(Arrays.toString(row));
 		}
 	}
}
	