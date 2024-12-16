package oops;

public class ReverseNumber {
	
	public static int reverse(int number) {
		int reversedigit =0;
		if(number <0) {
			return -1;
		}
		if (number ==0) {
			return 0;
		}
		while(number!=0) {
		int	lastdigit =number%10;
		reversedigit = reversedigit*10 + lastdigit;
		number = number/10;
		}
		return reversedigit;
	}



public static void main(String[] args) {
	//ReverseNumber reversed = new ReverseNumber();
	//int finalresult = reversed.reverse(12345);
	//reverse(12345);
	System.out.println( reverse(12345));
}

}