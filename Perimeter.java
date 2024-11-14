package prac3;
import java.util.Scanner;
class Perimeter {
	public static  double periSquare(double side) {
		return 4*side;
	}
	public static double rectangleperimeter(double length ,double width) {
		return 2*(length+width);
	}
	public static double circle(double radius) {
		 return 2 * Math.PI * radius;

	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int choice;
          do {
            System.out.println("Choose an option to calculate the perimeter:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                System.out.print("Enter the side of the square: ");
                double side = sc.nextDouble();
                System.out.println("Perimeter of Square: " + periSquare(side));
                break;

            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.println("Perimeter of Rectangle: " + rectangleperimeter(length, width));
                break;

            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("Perimeter of Circle: " + circle(radius));
                break;

            case 4:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
        System.out.println();
    } while (choice != 4);{

    sc.close();
   }

	}

	}

