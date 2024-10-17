package array;

public class SDArray {

	public static void main(String[] args) {
	String animals[]= {"Lion","Tiger","Dog","Cat","Camel","Horse","Yak","Zebra","Ox","Cow"};
	System.out.println(animals[2]);
	for(int i=0;i<animals.length;i++) {
		System.out.println(animals[i]);
	}
	int num[]=new int[10];
	num[0]=56;
	num[1]=67;
	num[2]=55;
	num[3]=78;
	num[4]=85;
	num[5]=77;
	num[6]=89;
	num[7]=88;
	num[8]=92;
	num[9]=66;
	System.out.println("Array Elementts");
	int larg=num[0];
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
		if(num[i]>larg) {
			larg=num[i];
		}
	
	}
	System.out.println("Largest No is "+larg);
	}
}
