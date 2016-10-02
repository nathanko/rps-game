// The "RPSgame" class.
import java.awt.*;
import hsa.Console;
import java.util.Random;

public class RPSgame2
{
    static Console c;           // The output console

    public static void main (String[] args)
    {

	c = new Console ();
	int userWins = 0;
	int compWins = 0;
	int draws = 0;
	int rounds = 0;

	c.println ("Welcome to Nathan's Rock, Paper, Scissor's Game!\nYou will play 10 rounds with the computer.\n************");

	while (rounds < 10)
	{
	    c.println ("Do you choose rock (1), paper (2), or scissors (3)? Enter the number.");

	    int failure = 0;
	    int user = c.readInt () - 1;
	    String userin = "error";
	    switch (user) //Translate users's numerical input into String

		{
		    case 0:
			userin = "rock";
			c.println ("You choose " + userin + ".");
			break;
		    case 1:
			userin = "paper";
			c.println ("You choose " + userin + ".");
			break;
		    case 2:
			userin = "scissors";
			c.println ("You choose " + userin + ".");
			break;
		    default:
			c.println ("Invalid input.");
			rounds = rounds - 1; //This round is refunded because of the invalid input
			break;

		}

	    if (failure == 0)
	    {

		int com = (int) (Math.random () * 3); //computer's decision among rock, paper, or scissors
		String comp = "error";
		switch (com) //Translate computer's numerical input into String

		    {
			case 0:
			    comp = "rock";
			    break;
			case 1:
			    comp = "paper";
			    break;
			case 2:
			    comp = "scissors";
			    break;

		    }
		if (user == 0)
		{
		    switch (com)
		    {
			case 0:
			    c.println ("Computer chooses " + comp + ".");
			    c.println ("This round is a tie!");
			    draws++;
			    break;
			case 1:
			    c.println ("Computer chooses " + comp + ".");
			    c.println ("Computer's " + comp + " beat your " + userin + ".");
			    compWins++;
			    break;
			case 2:
			    c.println ("Computer chooses " + comp + ".");
			    c.println ("Your " + userin + " beat computer's " + comp + ".");
			    userWins++;
			    break;
		    }
		}
		else if (user == 1)
		{
		    switch (com)
		    {
			case 0:
			    c.println ("Computer chooses " + comp + ".");
			    c.println ("Your " + userin + " beat computer's " + comp + ".");
			    userWins++;
			    break;
			case 1:
			    c.println ("Computer chooses " + comp + ".");
			    c.println ("This round is a tie!");
			    draws++;
			    break;
			case 2:
			    c.println ("Computer chooses " + comp + ".");
			    c.println ("Computer's " + comp + " beat your " + userin + ".");
			    compWins++;
			    break;
		    }
		}
		else if (user == 2)
		{
		    switch (com)
		    {
			case 0:
			    c.println ("Computer chooses " + comp + ".");
			    c.println ("Computer's " + comp + " beat your " + userin + ".");
			    compWins++;
			    break;
			case 1:
			    c.println ("Computer chooses " + comp + ".");
			    c.println ("Your " + userin + " beat computer's " + comp + ".");
			    userWins++;
			    break;
			case 2:
			    c.println ("Computer chooses " + comp + ".");
			    c.println ("This round is a tie!");
			    draws++;
			    break;
		    }
		}
		rounds++;
		//Display round results
		c.println ("---------------------");
		c.println ("Results so far...");
		c.println ("Your wins: " + userWins);
		c.println ("Computer wins: " + compWins);
		c.println ("Draws: " + draws);
		c.println ("Rounds played: " + rounds);
		c.println ("---------------------");
		c.println ();
	    }

	}
	if (userWins > compWins)
	{
	    c.println ("YOU WIN!");
	}
	if (userWins < compWins)
	{
	    c.println ("YOU LOSE! BETTER LUCK NEXT TIME.");
	}
	if (userWins == compWins)
	{
	    c.println ("TIE!");
	}
	c.println ("Goodbye. --Nathan");


	// Place your program here.  'c' is the output console
    } // main method
} // RPSgame2 class


