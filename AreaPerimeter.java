package pracatice;
import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the side lenght of square :");
		double side = sc.nextDouble();
		double area =side*side;
		double perimeter=4*side;
		System.out.println("Area of Square:"+area);
		System.out.println("Area of perimeter:"+perimeter);
		sc.close();
	}

}
