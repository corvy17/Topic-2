import java.util.Scanner;

public class Ex3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package (in pounds): ");
		
		double weight = input.nextDouble();
		double cost = 0;
		
		if (weight > 0 && weight<=1) {
			cost = 3.5;
		} else if (weight > 1 && weight<=3) {
			cost = 5.5;
		} else if (weight > 3 && weight<=10) {
			cost = 8.5;	
		} else if (weight > 10 && weight<=20) {
			cost = 10.5;
		} 
		
		if (cost == 0) {
			System.out.print("the package cannot be shipped.");
			System.exit(0);
		}
		System.out.print("The total shipping cost is "+ cost);
	}

}
