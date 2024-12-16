package oops;


import java.util.Scanner;
public class StringMagic {

	//private static final Readable InputStream = null;
	public int countUpperCaseLetters(String str) {
		//System.out.println();
		//this.str = str;
		int count =0;
		//int counter =0;
		if(str.isEmpty()) {
			return count;
		}
		for (int i=0; i<str.length(); i++) {
			char c= str.charAt(i);
		if (Character.isUpperCase(c)) {
			count = count+1;
			
		}
		//return count;
		}
		
		 return count;
	}
public static void main(String[] args) {
	/*Scanner str = new Scanner(System.in);
	//System.out.println("Enter string: ");
	//read user form input
	 String given = str.nextLine();
	 System.out.println( "Given string is: ");
		//given =str;*/
	 StringMagic output = new StringMagic();
	 output.countUpperCaseLetters("AisHu");
	 
}
}
