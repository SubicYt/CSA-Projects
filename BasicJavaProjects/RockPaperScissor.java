package BasicJavaProjects;
// ****************************************************************
//   Rock.java
//   Play Rock, Paper, Scissors with the user
// ****************************************************************
import java.util.Scanner;
public class RockPaperScissor
{
    public static void main(String[] args)
    {
	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay;  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number used to 	
	String PlayAgain; //Gets user input to play again		
	Scanner scan = new Scanner(System.in);		
      //determine computer's play
	  //Get player's play -- note that this is stored as a string
	System.out.println("Want to play Rock paper scissors? (y or n)");
	PlayAgain = scan.nextLine();
	while(PlayAgain.equals("y")){
		System.out.println("Enter your play");
	personPlay = scan.nextLine();
	//Make player's play uppercase for ease of comparison
    personPlay = personPlay.toUpperCase();
	//Generate computer's play (0,1,2)
	computerInt = (int)(Math.random() * 3);
	//Translate computer's randomly generated play to string
	if (computerInt ==1){
		computerPlay = "R";
	}else if(computerInt==2){
		computerPlay = "P";
	}else{
		computerPlay = "S";
	}
	//Print computer's play
	System.out.println("Computer's play is " + computerPlay);
	//See who won.  Use nested ifs instead of &&.
	if (personPlay.equals(computerPlay))  
	    System.out.println("It's a tie!");
	else if (personPlay.equals("R"))
	    if (computerPlay.equals("S"))
		System.out.println("Rock crushes scissors.  You win!!");
	    else{
			System.out.println("You lose!");
		}
		//...  Fill in rest of code
	if(personPlay.equals("P")){
	}else if(computerPlay.equals("S")){
		System.out.println("Scissors cut paper... You lose");
	}else{
		System.out.println("Paper wins!");
	}
	if(personPlay.equals("S")){
	}else if(computerPlay.equals("R")){
		System.out.println("Rock beats scissors. You lose");
	}else{
		System.out.println("Scissors Wins!");
	}
	//Player Plays again

	System.out.println("Do you wish to play again? (y or n)");
	PlayAgain = scan.nextLine();
	}
	//Exit While Loop
	System.out.println("Good Game");
    }
}

