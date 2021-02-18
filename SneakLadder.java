package LadderSneak;
import java.util.Random;
import java.util.Scanner;

class FindPosition {
	final int STARTING_POSITION=0;
	final int END_POSITION=100;
	static int diceoutput;
	static int position_of_player1;
	static String Player1;
	static int choice1;
	static int diceoutput1;
	static int position_of_player2;
	static String Player2;
	static int choice;
	final int noPlay=1;
	final int ladder=2;
	final int sneak=3;
	int diceRollCount=0;
	int diceRollCount1=0;

    void initialization() // UC1
	{
		Scanner s= new Scanner(System.in);
		System.out.println("\nEnter player 1 name =");
		String player1 = s.nextLine();
		System.out.println("\nPlayer 1 name = "+player1);
		position_of_player1=STARTING_POSITION;
		System.out.println("\nStarting Player1 Position ="+position_of_player1);
		Scanner s1= new Scanner(System.in);
		System.out.println("\nEnter player 2 name =");
		String player2 = s1.nextLine();
		System.out.println("\nPlayer 2 name = "+player2);
		position_of_player2=STARTING_POSITION;
		System.out.println("\nStarting Player2 Position ="+position_of_player2);
		System.out.println("\nStarting Player1 Position ="+position_of_player1);

	}
		void rollingADice() {    // UC2 
	          
			Random random = new Random();
			diceoutput= random.nextInt(6)+1;
                	System.out.println("Dice output for player1 = "+diceoutput);
	        	diceRollCount=diceRollCount+1;
                	}
		void rollingADice1()   { // UC2 
			
			Random random1 = new Random();
			diceoutput1= random1.nextInt(6)+1;
		    	System.out.println("Dice output for player2 = "+diceoutput1);
		    	diceRollCount1=diceRollCount1+1;
	     		}
     void tillAPositionReached() { 

         	while(position_of_player1<END_POSITION && position_of_player2<END_POSITION)
		{
			rollingADice();
			rollingADice1();
			Random random = new Random();
			Random random1 = new Random();
			choice = random.nextInt(3)+1;
			choice1 = random1.nextInt(3)+1;
			System.out.println("Choice for player1="+choice);
			System.out.println("Choice for player2 ="+choice1);
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
      	  //System.out.println("--------------------------------------------------------");

	        switch (choice1)
	        {
	        case noPlay : 
	        	  position_of_player2= position_of_player2+0;
	        	  System.out.println("\nUpdated Player2 Position = "+position_of_player2);
	        	  break;
	        case ladder :
	        	  position_of_player2= position_of_player2+diceoutput1;
	        	  System.out.println("\nUpdated Player2 Position = "+position_of_player2);
	        	  if(position_of_player2==END_POSITION)
	        	  {
	        		  break;  
	        	  }
	        	  else if(position_of_player2>END_POSITION)
	        	  {
	        		  position_of_player2= position_of_player2-diceoutput1;
	        	  }
	        	  break; 
	        case sneak : 
	        	   position_of_player2= position_of_player2-diceoutput1;
	        		   if(position_of_player2<STARTING_POSITION)
	        		   {
	        			   position_of_player2=0; 
	        		   }
	        	   System.out.println("\nUpdated Player2 Position = "+position_of_player2);
	         	   break;
	        }	
	      	 System.out.println("--------------------------------------------------------");

		}
	if(position_of_player1>=100)
	{
		//System.out.println("\nWe reached final position so we got out of the loop.");
		System.out.println("\nNumber of ties dice1 is rolled = "+diceRollCount);
    	System.out.println("player1 is won");
	}
	if(position_of_player2>=100)
	{
		//System.out.println("\nWe reached final position so we got out of the loop.");
		System.out.println("\nNumber of ties dice2 is rolled = "+diceRollCount1);
		System.out.println("player2 is won");
	}
}
}
class SneakLadder {
	public static void main(String[] args) 
	{
		System.out.println("\n\nWelcome to the Sneak & Ladder program");
		FindPosition obj1 = new FindPosition();
		obj1.initialization();
		//obj1.rollingADice();
		//obj1.checkForOption();
		obj1.tillAPositionReached();
		
	}
}
