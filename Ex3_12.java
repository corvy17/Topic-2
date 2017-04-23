import java.util.Scanner;

public class Ex3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit number: ");
		int user = input.nextInt();
		
		int reverse = 0;
		
		int n1 = user % 10;
		reverse = user / 10;
		int n2 = reverse % 10;
		int n3 = reverse / 10;
		
		String rev = Integer.toString(n3) + Integer.toString(n2) + Integer.toString(n1);
	    String original = Integer.toString(user);
	   
	    if (rev.equals(original)) {
	    	System.out.println(original + " is a palindrome");
	    } else {
	    	System.out.println(original + " is not a palindrome");
	    }
	}

}
