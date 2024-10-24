package pracquestion;

public class StringOperations {

	public static void main(String[] args) {
		String str1="welcome";
		String str2="to java programming session";
		String concatenatedString = str1+" "+str2;
		System.out.println("Concatenated String"+concatenatedString);
		int index=concatenatedString.indexOf('p');
		System.out.println("index of string:"+index);
		char charAt = concatenatedString.charAt(6);
		System.out.println("Character at index 6"+charAt);
		int comparison =str1.compareTo(str2);
       	if(comparison==0) {
       		System.out.println ("Str1 and str2 are same");
       	}
       	else if(comparison<0) {
       		System.out.println("atr1 is smaller than str2");
       	}
		
       boolean areEqual =str1.equals(str2);
       System.out.println("Are str1 and str2 equal?"+areEqual);
	}

}
