package games;
import java.util.Random;
import java.util.Scanner;
	class Sumit {
		final int STARTING_POSITION=0;
		final int END_POSITION=100;
		static int diceoutput;
		static int position_of_player1;
		static String Player1;
		static int choice;
		final int noPlay=1;
		final int ladder=2;
		final int sneak=3;
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
		   System.out.println("rolls the die and get the number  = "+diceoutput);
		}
		void tillAPositionReached() 
		{
			while(position_of_player1>=STARTING_POSITION && position_of_player1<END_POSITION)
			{
				rollingADice();
				Random random = new Random();
				choice = random.nextInt(3)+1;
				System.out.println("Choice ="+choice);
		        switch (choice)
		        {
		        case noPlay : 
		        	  position_of_player1= position_of_player1+0;
		        	  System.out.println("\nUpdated Player1 Position = "+position_of_player1);
		        	  break;
		        case ladder :
		        	  position_of_player1= position_of_player1+diceoutput;
		        	  System.out.println("\nUpdated Player1 Position = "+position_of_player1);
		        	  if(position_of_player1==END_POSITION)
		        	  {
		        		  break;  
		        	  }
		        	  else if(position_of_player1>END_POSITION)
		        	  {
		        		  position_of_player1= position_of_player1-diceoutput;
		        	  }
		        	  break; 
		        case sneak : 
		        	   position_of_player1= position_of_player1-diceoutput;
		        		   if(position_of_player1<STARTING_POSITION) 
		        		   {
		        			   position_of_player1=0; 
		        		   }
		        	   System.out.println("\nUpdated Player1 Position = "+position_of_player1);
		         	   break;
		        }	
			}
	}
	}
	public class SneakLadder {
    public static void main(String[] args) {
		System.out.println("Welcome to the Sneak & Ladder program.");
		Sumit obj1 = new Sumit();
		obj1.initialization();
		//obj1.rollingADice();
        //obj1.checkForOption();
		obj1.tillAPositionReached();


   }
}
