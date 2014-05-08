/* 
 * Wein T Wong
 * Section 5993
 * December 4, 2013
 * HW #9
 */

/*
 * This program creates two players--a computer player and a human player--for the text-based version of the game Battleship. 
 * The two players play the game against each other.
 * The computer player will randomly initialize the positions of ships on the board and pseudo-randomly make guesses on the board. 
 * The human player will receive from the user the initial ship positions and each of the user's guesses. 
 */

abstract class Player { // class represents information associated with all players
	private int columnGuess; // player's current column guess
	private String name; // player's name
	private char rowGuess; // player's current row guess
	private Screen screen; // makes the player's screen available and allows player to see where previous guesses have been hits or misses
	public Player()
	{
		// default constructor
		columnGuess = 3;
		this.name = new String();
		rowGuess = 'a';
	}
	public Player(int columnGuess, String name, char rowGuess, Screen screen)
	{
		// initialization constructor
		this.columnGuess = columnGuess;
		this.name = name;
		this.rowGuess = rowGuess;
		this.screen = screen;
	}
	public abstract void positionShips(Ship[] ships) // receives an array of ships and returns nothing
	{
		
	}
	public abstract void makeGuess() // receives not parameters and returns
	{
		return;
	}
	public String toString() // returns a space
	{
		return " ";
	}
	public void printInfo() // returns string
	{
		System.out.println(toString());
	}
}

class ComputerPlayer extends Player { // class represents a computer player in the game and is a subclass of Player
	public ComputerPlayer()
	{
		super(); 
	}
	// randomly initializes the positions of ships on the board and pseudo-randomly makes guesses on the board
	public ComputerPlayer(String name)
	{
		super(name)
	}
	public void makeGuess()
	{
		super();
	}
	public String toString()
	{
		return;
	}
	public void printInfo()
	{

	}
}

class HumanPlayer extends Player { // class represents a human player in the game and is a subclass of Player
	public HumanPlayer()
	{
		super();
	}
	// receives from the user the initial ship positions and each of the user's guesses
	public HumanPlayer(String name)
	{
		super(name);
	}
	public void makeGuess()
	{
		super();
	}
	public String toString()
	{
		return;
	}
	public void printInfo()
	{
		
	}
}
