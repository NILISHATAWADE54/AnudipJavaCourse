package exceptionhandling;

public class ass {

	public static void main(String[] args) {
		int num[]= {2,4,6,8,10};
		for(int i=0;i<=num.length;i++) {
			try {
				System.out.println("Element at index"+i+":"+num[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException!tried to access index"+i);
			}
			
		}

	}

}
