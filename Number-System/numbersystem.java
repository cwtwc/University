import java.util.Scanner;


class NumberSystem {
	private int value, col;
	//Properties
	public NumberSystem() {
	}
	public NumberSystem(int p, int o) {
		value = p;
		col = o; 
	}
	//Initialization constructor
	public void printNumber() {
	//Method with options to print number systems of 1-10 in the format of 1, 2, or 3 digits
		if (value == 1 && col == 1) { 
		int row, col;
		System.out.println("0"); 
		for(row = 1; row < 6; row++) {
		for(col = 1; col <= row; col++) {
			System.out.print(1);
			}
			System.out.println();
			}
		}
		//Prints counting sequence for user-selected number system of 1 and digit format of 1
		else if (value == 1 && (col == 2)) { 
		int row, col;
		System.out.println("00"); 
		System.out.println("01"); 
		for(row = 2; row < 6; row++) {
		for(col = 1; col <= row; col++) {
			System.out.print(1);
			}
			System.out.println();
		}
		}
		//Prints counting sequence for user-selected number system of 1 and digit format of 2
		else if (value == 1 && (col == 3)) { 
		int row, col;
		System.out.println("000"); 
		System.out.println("001"); 
		System.out.println("011"); 
	    	for(row = 3; row < 6; row++) {
		for(col = 1; col <= row; col++) {
			System.out.print(1);
			}
		      	System.out.println();
		}
		}
		//Prints counting sequence for user-selected number system of 1 and digit format of 3
		else if (value == 2 && (col > 0 && col < 4)) {
	        for(int i = 0; i < 8; i++)  
	        //8 is arbitrary number which dictates the amount of numbers printed (differs by number system)
	        {  
	            String bin = Integer.toBinaryString(i);  
	            for(int j = bin.length(); j < col; j++)  
	            {  
	                System.out.print("0");  
	            }  
	            System.out.println(bin);  
	        }  
		}
		//Prints counting sequence for user-selected number system of 2
		
		else if (value == 3 && (col > 0 && col < 4)) { 
	        for(int i = 0; i < 8; i++)  
	        //8 is arbitrary number which dictates the amount of numbers printed (differs by number system)
	        {  
	            String three = Integer.toString(i, 3);  
	            for(int j = three.length(); j < col; j++)  
	            {  
	                System.out.print("0");  
	            }  
	            System.out.println(three);  
	        }  
	  
	    }  
		//Prints counting sequence for user-selected number system of 3
		
		else if (value == 4 && (col > 0 && col < 4)) { 
	        for(int i = 0; i < 8; i++)  
	        //8 is arbitrary number which dictates the amount of numbers printed (differs by number system)
	        {  
	            String four = Integer.toString(i, 4);  
	            for(int j = four.length(); j < col; j++)  
	            {  
	                System.out.print("0");  
	            }  
	            System.out.println(four);  
	        }  
	  
	    }  
		//Prints counting sequence for user-selected number system of 4
		else if (value == 5 && (col > 0 && col < 4)) { 
	        for(int i = 0; i < 10; i++)  
	        //10 is arbitrary number which dictates the amount of numbers printed (differs by number system)
	        {  
	            String five = Integer.toString(i, 5);  
	            for(int j = five.length(); j < col; j++)  
	            {  
	                System.out.print("0");  
	            }  
	            System.out.println(five);  
	        }  
	  
	    }  
		//Prints counting sequence for user-selected number system of 5
		
		else if (value == 6 && (col > 0 && col < 4)) { 
	        for(int i = 0; i < 15; i++)  
	        //15 is arbitrary number which dictates the amount of numbers printed (differs by number system)
	        {  
	            String six = Integer.toString(i, 6);  
	            for(int j = six.length(); j < col; j++)  
	            {  
	                System.out.print("0");  
	            }  
	            System.out.println(six);  
	        }  
	  
	    }  
		//Prints counting sequence for user-selected number system of 6
		
		else if (value == 7 && (col > 0 && col < 4)) { 
	        for(int i = 0; i < 20; i++)  
	        //20 is arbitrary number which dictates the amount of numbers printed (differs by number system)
	        {  
	            String seven = Integer.toString(i, 7);  
	            for(int j = seven.length(); j < col; j++)  
	            {  
	                System.out.print("0");  
	            }  
	            System.out.println(seven);  
	        }  
	  
	    }
		//Prints counting sequence for user-selected number system of 7
		else if (value == 8 && (col > 0 && col < 4)) { 
	        for(int i = 0; i < 64; i++)  
	        //64 is arbitrary number which dictates the amount of numbers printed (differs by number system)
	        {  
	            String oct = Integer.toOctalString(i);  
	            for(int j = oct.length(); j < col; j++)  
	            {  
	                System.out.print("0");  
	            }  
	            System.out.println(oct);  
	        }  
	  
	    }  
		//Prints counting sequence for user-selected number system of 8
		
		else if (value == 9 && (col > 0 && col < 4)) {
			for(int i = 0; i < 12; i++)  
			//12 is arbitrary number which dictates the amount of numbers printed (differs by number system)
	        { 
	        	String nine = Integer.toString(i, 9);
	        	for(int j = nine.length(); j < col; j++) 
	        	{
	        		System.out.print("0");
	        	}
	        	System.out.println(nine);  
	        }
		}
		//Prints counting sequence for user-selected number system of 9
		
		else if (value == 10 && (col > 0 && col < 4)) {
	        for(int i = 0; i < 40; i++)  
	        //40 is arbitrary number which dictates the amount of numbers printed (differs by number system)
	        {  
	            String bin = Integer.toString(i);  
	            for(int j = bin.length(); j < col; j++)  
	            {  
	                System.out.print("0");  
	            }  
	            System.out.println(bin);  
	        }  
		}
		//Prints counting sequence for user-selected number system of 10
		
		 else
		//Verifies whether inputed value is not an expected value
		 	{
			 	System.out.println("You entered at least one unacceptable input. Returning to menu...");
			 	//Inputed information is unacceptable--a blank line is printed followed by the menu
		 	}
	}
}


class Driver {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("A\tPrint custom counting sequence");
		System.out.println("B\tQuit");
		System.out.print("To select option, enter its corresponding letter: ");
		String menuOptionString = scn.next();
		char menuOption = menuOptionString.charAt(0);
		//Displays menu options and prompts user to enter information
		if (menuOption == 'A' || menuOption == 'a')
		//Discerns between input of A or a 
		{
			System.out.print("Enter the value (1-10) of the number system that you would like to display: ");
			int i = scn.nextInt(); 
			scn.nextLine();
			//Stores inputed information
			System.out.print("Enter the value (1-3) of the three digit sequence option that you would like to display: ");
			int k = scn.nextInt(); 
			//Stores inputed information
			NumberSystem value1 = new NumberSystem(i, k);
			value1.printNumber(); 
			//Prints counting sequence 
			System.out.println("");
			run();
			//Prints a blank line, then displays menu once again so the user can select additional options    
		}
		else if (menuOption == 'B' || menuOption == 'b')
		// Discerns between input of B or b
		{
			System.out.println("Exiting... Thank you for using the program.");
			//User has quit the problem; no further prompts
		}
		else
		//Verifies whether inputed value is not an expected value
		{
			System.out.println("Unacceptable input. To select option, enter its corresponding letter: ");
			//If inputed letter did not correspond to one of the options, the user is prompted to enter an acceptable letter
			System.out.println("");
			run();
			//Prints a blank line, then displays menu once again so the user can select additional options
		}
		scn.close();
	}

	private static void run() {
	//Ensures that the menu will be displayed again and again until the user quits
		Scanner scn = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("A\tPrint custom counting sequence");
		System.out.println("B\tQuit");
		System.out.print("To select option, enter its corresponding letter: ");
		String menuOptionString = scn.next();
		char menuOption = menuOptionString.charAt(0);
		//Displays menu options and prompts user to enter information
		if (menuOption == 'A' || menuOption == 'a')
		//Discerns between input of A or a 
		{
			System.out.print("Enter the value (1-10) of the number system that you would like to display: ");
			int i = scn.nextInt(); 
			scn.nextLine();
			//Stores inputed information
			System.out.print("Enter the value (1-3) of the three digit sequence option that you would like to display: ");
			int k = scn.nextInt(); 
			//Stores inputed information
			NumberSystem value1 = new NumberSystem(i, k);
			value1.printNumber(); 
			//Prints counting sequence 
			System.out.println("");
			run();
			//Prints a blank line, then displays menu once again so the user can select additional options    
		}
		else if (menuOption == 'B' || menuOption == 'b')
		// Discerns between input of B or b
		{
			System.out.println("Exiting... Thank you for using the program.");
			//User has quit the problem; no further prompts
		}
		else
		//Verifies whether inputed value is not an expected value
		{
			System.out.println("Unacceptable input. To select option, enter its corresponding letter: ");
			//If inputed letter did not correspond to one of the options, the user is prompted to enter an acceptable letter
			System.out.println("");
			run();
			//Prints a blank line, then displays menu once again so the user can select additional options
		}
		scn.close();
	}
}
