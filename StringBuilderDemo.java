package string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("h how are you!");
		str.insert(1,"ello");
		System.out.println(str);
		str.append("welcome to  programming world!");
		System.out.println(str);
		str.delete(2, 12);
		System.out.print(str);
		str.replace(0,2, "hello");
		System.out.print(str);
		

	}

}
