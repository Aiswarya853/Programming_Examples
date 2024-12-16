package oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		cleanCode.Read();
		effectiveJava.Read();
		artOfComputerProgramming.Read();
		cleanCode.setNoOfCopies(5);

	}

}
