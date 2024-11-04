package pracatice;

public class Pattern {

	public static void main(String[] args) {
		
		int i,j,r=4;
		for(i=0;i<r;i++) {
			for(j=2*(r-i);j>0;j--);{
				System.out.println("");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*"+"\t");
			}
		}
		System.out.println();
	}

}
