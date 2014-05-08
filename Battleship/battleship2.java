/* Wein T Wong
 * Section 5993
 * November 22, 2013
 * HW8
 */

/* The program I am implementing returns information on several ships on a board.
 * The user specifies the location of the ship (by column and row), and whether it is horizontal or vertical.
 * The number of positions of the ship is already specified and cannot be customized.
 * The program returns to the user the type of ship, the number of positions it holds on the board, where it is located by column (number) and row (letter), and the ship's orientation.
 */

class Ship	//superclass
{
//instance properties which are inherited by the subclasses
	protected int column;
	protected boolean horizontal;
	protected int positions;
	protected char row;
	//default constructor
	public Ship()
	{
		column = 4;
		horizontal = true;
		positions = 3;
		row = 'a';
	}
	//initialization constructor
	public Ship(int column, boolean horizontal, int positions, char row)
	{
		this.column = column;
		this.horizontal = horizontal;
		this.positions = positions;
		this.row = row;
	}
}

class AircraftCarrier extends Ship	//subclass
{
	//ship takes up 5 positions on the board
	final int positions = 5;
	//refers to superclass
	public AircraftCarrier()
	{
		super();
	}
	public AircraftCarrier(int column, boolean horizontal, int positions, char row)
	{
		super(column, horizontal, positions, row);
	}
	//returns type of ship, the number of positions it holds on the board, its location (column and row), and its orientation
	public String toString()
	{
		 return "This ship is an Aircraft Carrier. It holds " + positions + "positions on the board. It is located at column " + column + " and row " + row + ". Its orientation is horizontal: " + horizontal + ".";	
	}
	//prints the string
	public void printInfo()
	{
		System.out.println(toString());
	}
}

class Battleship extends Ship	//subclass
{
	//ship takes up 4 positions on the board
	final int positions = 4;
	//refers to superclass
	public Battleship()
	{
		super();
	}
	public Battleship(int column, boolean horizontal, int positions, char row)
	{
		super(column, horizontal, positions, row);
	}
	//returns type of ship, the number of positions it holds on the board, its location (column and row), and its orientation
	public String toString()
	{
		 return "This ship is a Battleship. It holds " + positions + "positions on the board. It is located at column " + column + " and row " + row + ". Its orientation is horizontal: " + horizontal + ".";	
	}
	//prints the string
	public void printInfo()
	{
		System.out.println(toString());
	}
}


class Destroyer extends Ship	//subclass
{
	//ship takes up 3 positions on the board
	final int positions = 3;
	//refers to superclass
	public Destroyer()
	{
		super();
	}
	public Destroyer(int column, boolean horizontal, int positions, char row)
	{
		super(column, horizontal, positions, row);
	}
	//returns type of ship, the number of positions it holds on the board, its location (column and row), and its orientation
	public String toString()
	{
		 return "This ship is a Destroyer. It holds " + positions + "positions on the board. It is located at column " + column + " and row " + row + ". Its orientation is horizontal: " + horizontal + ".";	
	}
	//prints the string
	public void printInfo()
	{
		System.out.println(toString());
	}
}

class Submarine extends Ship	//subclass
{
	//ship takes up 3 positions on the board
	final int positions = 3;
	//refers to superclass
	public Submarine()
	{
		super();
	}
	public Submarine(int column, boolean horizontal, int positions, char row)
	{
		super(column, horizontal, positions, row);
	}
	//returns type of ship, the number of positions it holds on the board, its location (column and row), and its orientation
	public String toString()
	{
		 return "This ship is a Submarine. It holds " + positions + "positions on the board. It is located at column " + column + " and row " + row + ". Its orientation is horizontal: " + horizontal + ".";	
	}
	//prints the string
	public void printInfo()
	{
		System.out.println(toString());
	}
}

class PatrolBoat extends Ship	//subclass
{
	//ship takes up 2 positions on the board
	final int positions = 2;
	//refers to superclass
	public PatrolBoat()
	{
		super();
	}
	public PatrolBoat(int column, boolean horizontal, int positions, char row)
	{
		super(column, horizontal, positions, row);
	}
	//returns type of ship, the number of positions it holds on the board, its location (column and row), and its orientation
	public String toString()
	{
		 return "This ship is a Patrol Boat. It holds " + positions + "positions on the board. It is located at column " + column + " and row " + row + ". Its orientation is horizontal: " + horizontal + ".";	
	}
	//prints the string
	public void printInfo()
	{
		System.out.println(toString());
	}
}
