import java.util.Scanner;
public class Ex3_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 double weight1, price1, weight2, price2;
		 double ratio1, ratio2;
		  
		 System.out.print("Enter weight and price for package 1:");
		 weight1 = input.nextDouble();
		 price1 = input.nextDouble();
		 ratio1 = weight1/price1;
		  
		 System.out.print("Enter weight and price for package 2:");
		 weight2 = input.nextDouble();
		 price2 = input.nextDouble();
		 ratio2 = weight2/price2;
		  
		 if(ratio1 < ratio2) {
		  System.out.print("Package 1 has better price.");
		 } else if(ratio1 == ratio2) {
		  System.out.print("Two packages have the same price.");
		 } else {
		  System.out.print("Package 2 has better price.");
		 }
		}
}