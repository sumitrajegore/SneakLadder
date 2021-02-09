package games;
import java.util.Random;
import java.util.Scanner;
	class Sumit {
		final int STARTING_POSITION=0;
		final int END_POSITION=100;
		static int diceoutput;
		static int position_of_player1;
		static String Player1;
		void initialization() // UC1
		{
			Scanner s= new Scanner(System.in);
			System.out.println("\nEnter player 1 name =");
			String player1 = s.nextLine();
			System.out.println("\nPlayer 1 name = "+player1);
			position_of_player1=STARTING_POSITION;
			System.out.println("\nStarting Player1 Position ="+position_of_player1);
		}
		void rollingADice()    // UC2 
		{
			Random random = new Random();
			diceoutput= random.nextInt(6)+1;
		   System.out.println("\nrolls the die and get the number  = "+diceoutput);
		}
	    }
	public class SneakLadder {
    public static void main(String[] args) {
		System.out.println("Welcome to the Sneak & Ladder program.");
		Sumit obj1 = new Sumit();
		obj1.initialization();
		obj1.rollingADice();
   }
}
