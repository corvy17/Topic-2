import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int day = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();
		
		int future_day = (day + elapsed) % 7;
		String day_week = "";
		
		switch(day) {
		case 0: day_week = "Sunday"; break;
		case 1: day_week = "Monday"; break;
		case 2: day_week = "Tuesday"; break;
		case 3: day_week = "Wednesday"; break;
		case 4: day_week = "Thursday"; break;
		case 5: day_week = "Friday"; break;
		case 6: day_week = "Satday"; break;

		}
		
		if (future_day == 0) {
			System.out.printf("Today is %s and the future day is Sunday", day_week);
		} else if (future_day == 1) {
			System.out.printf("Today is %s and the future day is Monday", day_week);
		} else if (future_day == 2) {
			System.out.printf("Today is %s and the future day is Tuesday", day_week);
		} else if (future_day == 3) {
			System.out.printf("Today is %s and the future day is Wednesday", day_week);
		} else if (future_day == 4) {
			System.out.printf("Today is %s and the future day is Thursday", day_week);
		} else if (future_day == 5) {
			System.out.printf("Today is %s and the future day is Friday", day_week);
		} else if (future_day == 6) {
			System.out.printf("Today is %s and the future day is Saturday", day_week);
		}
		
		

	}

}
