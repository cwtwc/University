/**
 * Name: Wein T Wong                                   
 * Section: 5993                                       
 * Assignment: 3                                       
 * Due date: October 7, 2013      		      
 * Description: This class provides a menu which contains several options for methods that the user wishes to run.
 * Once the method is selected, the user will be prompted to submit additional information in the menu in order to perform the operations.
 * Any values passed to the methods that are in use will be received from the user, and the method calls' returned results will be printed accordingly.                 
 */

import java.util.Scanner;

public class HW3
{
  public HW3() {
  }
  public void run() {
    Scanner s = new Scanner(System.in);
    System.out.println("Menu");
    System.out.println("A) Reverse String");
    System.out.println("B) Return Substring");
    System.out.println("C) Return Fraction of Alphabet");
    System.out.println("D) Quit");
    System.out.print("To select option, enter its corresponding letter: ");
    String menuOptionString = s.next();
    char menuOption = menuOptionString.charAt(0);
    //Displays menu options and prompts user to enter information

    if (menuOption == 'A' || menuOption == 'a')
    //Discerns between input of A or a
       {
       System.out.println("What String would you like reversed?");
       Scanner reverseS = new Scanner (System.in)
       String reverseString = reverseS.nextLine();
       //Stores inputted string of characters
       System.out.println(reverse(reverseString));
       //Reverses a received String and prints returned reversed string of characters
       System.out.println("");
       run();
       //Prints a blank line, then displays menu once again so the user can select additional options    
       }
    else if (menuOption == 'B' || menuOption =='b')
    //Discerns between input of B or b
       {
       System.out.print("What is the string of the substring you would like to receive?");
       Scanner substringS = new Scanner (System.in);
	Scanner valueS1 = new Scanner(System.in);
	Scanner valueS2 = new Scanner(System.in);
       String subString = substringS.nextLine();
       //Stores inputted string of characters
       System.out.print("What is the first value?");
       int firstSubstring = valueS1.nextInt();
       //Stores the inputted first value
       System.out.print("What is the last value?");
       int lastSubstring = valueS2.nextInt();
       //Stores the inputted last value
       System.out.println(ourSubstring(subString, firstSubstring, lastSubstring));
       //Performs ourSubstring with the values received, and then the returned string is printed
       System.out.println("");
       run();
       //Prints a blank line, then displays menu once again so the user can select additional options
       }
    else if (menuChoice == 'C' || menuChoice == 'c')
    //Discerns between input of C or c
       {
       System.out.print("At which upper case letter would you like to begin the alphabet?");
       String firstLetter = s.next();
       //Stores inputted beginning upper case letter of alphabet
       System.out.print("At which upper case letter would you like to end the alphabet? ");
       String lastLetter = s.next();
       //Stores inputted ending upper case letter of alphabet
       char beginAlphabet = firstLetter.charAt(0);
       char endAlphabet = lastLetter.charAt (0);
       //Inputted letters of type string are changed to char, to be used later as ints
       System.out.println(alphabet(beginAlphabet, endAlphabet));
       //Performs alphabet with received values, and then the returned string is printed
       System.out.println("");
       run();
       //Prints a blank line, then displays menu once again so the user can select additional options
       }    
    else if (menuChoice == 'D' || menuChoice == 'd')
    // Discerns between input of D or d
       {
       System.out.println("Exiting the program.");
       //Once the user is done with the program, the run method is not performed
       }
    else
    //Verifies whether inputted value is not an expected value
       {
       System.out.println("Unacceptable input. To select option, enter its corresponding letter: ");
       //If inputted letter did not correspond to one of the options, the user is prompted to enter an acceptable letter
       System.out.println("");
       run();
       //Prints a blank line, then displays menu once again so the user can select additional options
       }
    }
  public String reverse(String toReverse)
    {
    String str = "";
       for (int i = toReverse.length() - 1; i>=0; i--)
       //i is equal to the last index position, and then it continues to run in reverse until one of the following is reached: the index position of 0, or the first letter of the term
          {
          str += toReverse.charAt (i); 
          //Adds last character of the string in the defined parameter, then adds the second to last character, third to last, and so on
          }
    return str;
    //Reversed string is returned
    }
  public String ourSubstring(String subString, int firstSubstring, int lastSubstring)
    {
    String str = "";
    for (int i = firstSubstring; i < lastSubstring; i++)
    //i is equal to inputted first value and continues to work chronologically in the string until the last value
          {
          str += subString.charAt(i);
          //Adds to a new string of characters one at a time
          }
    return str;
    //Substring is returned
    } 
  public String alphabet(char beginAlphabet, char endAlphabet)
    {
    String str = "";
    int i;
    int firstInt = (int)beginAlphabet;
    int secondInt = (int)endAlphabet;
    //Stores ASCII values of two int values
    if (firstInt < secondInt) {
    for (i = firstInt; i < secondInt; i++)
    //i starts at the ASCII value of inputted first value and ends right before the ASCII value of the second inputted value
          {
          str += (char)i;
          //For each time loop runs, the character¡¯s ASCII value is added to the string
          }
    return str;
    //Returns a string composed of the range of inputted char values
    }
    else {
       	 return "";
    }
    //Returns empty string because range must be inclusive of the starting char and exclusive of the ending char
  }
}

