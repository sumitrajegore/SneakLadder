package LadderSneak;
import java.util.Scanner;
class SneakLadder1 {
	final int STARTING_POSITION=0;
	static int position_of_player1;
	static String Player1;
	void initialization() // UC1
	{
		System.out.println("Enter player 1 name =");
		Scanner s = new Scanner(System.in);
		String player1 = s.nextLine();
		System.out.println("Player 1 name = "+player1);
		position_of_player1=STARTING_POSITION;
		System.out.println("Starting Player1 Position =" +position_of_player1);
	}
}
class SneakLadder {
	public static void main(String[] args) 	{
		System.out.println("Welcome to the Sneak & Ladder program");
     	SneakLadder1 obj1 = new SneakLadder1();
		obj1.initialization();
	}
}