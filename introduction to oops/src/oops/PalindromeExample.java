package oops;

public class PalindromeExample {

	public static void main(String[] args) {
		String word ="MALAYALAM";
		String reverseword = "";
		for (int i=word.length()-1; i>=0; i-- ) {
		char reverse = word.charAt(i);
		 reverseword = reverse + reverseword;
		
		//StringBuilder reverseword =new StringBuilder();
		}
		System.out.println(reverseword);
		if(word.equalsIgnoreCase(reverseword)) {
			System.out.println("This is a palindrome");
		}
		else {
			System.out.println("This is not a palindrome");
		}
		
	}

}
