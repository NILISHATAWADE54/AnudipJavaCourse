package string;

public class StringDemo {

	public static void main(String[] args) {
		String str=new String("Welcome to the Java Programming World!");
		String[] splitString=str.split(" ");
		for(String word : splitString) {
        System.out.println(word);
	}

}
}
