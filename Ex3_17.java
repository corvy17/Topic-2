import java.util.Scanner;

public class Ex3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int game = (int)(Math.random() * 3);
		
		System.out.print("scissors (0), rock(1), paper(2): ");
		int player = input.nextInt();
		
		System.out.print("The computer is ");
		switch (game) {
		case 0 : System.out.print("scissor."); break;
		case 1 : System.out.print("rock."); break;
		case 2 : System.out.print("paper.");
		}
		
		System.out.print(" You are ");
		switch (player) {
		
		case 0 : System.out.print("scissor."); break;
		case 1: System.out.print("rock."); break;
		case 2: System.out.print("paper. ");
		}
		
		if (game == player)
			System.out.println(" too. It is a draw");
		
		else {
			boolean win = (player == 0 && game == 2) ||
					(player == 1 && game == 0) ||
					(player == 2 && game ==1);
			if (win)
				System.out.println(". You won!");
			else 
				System.out.println(". You Loser!");
		}

		
		
		

	}

}
