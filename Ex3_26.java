import java.util.Scanner;

public class Ex3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		
		System.out.println("Is 10 divisible by 5 and 6? " +
				((integer % 5 == 0) && (integer  % 6 == 0)));
		System.out.println("Is 10 divisible by 5 or 6? " +
				((integer  % 5 == 0) || (integer  % 6 == 0)));
		System.out.println("Is 10 divisible by 5 of 6, but not both? " +
				((integer  % 5 == 0) ^ (integer  % 6 == 0)));
		}
		

	}


