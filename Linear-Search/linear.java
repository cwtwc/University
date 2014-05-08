import java.util.ArrayList;
import java.util.Scanner;


public class LinearSearch {
	{
		  public static void main(String args[]) {
			    int q, n, search, array[];
			 
			    Scanner in = new Scanner(System.in);
			    System.out.println("How many elements?");
			    n = in.nextInt(); 
			    array = new int[n];
			 
			    System.out.println("Enter " + n + " integers");
			 
			    for (q = 0; q < n; q++)
			      array[q] = in.nextInt();
			 
			    System.out.println("Enter value to find: ");
			    search = in.nextInt();
		 
		    for (q = 0; q < n; q++)
		    {
			      if (array[q] == search)     
			      {
			         System.out.println(search + " can be found in " + (q + 1));
			          break;
			      }
			   }
			   if (q == n) 
			      System.out.println(search + " cannot be found in the array");
			}
	public void addWord(Word word) {
	if {
	}
	}
	else
	{
		return -1;
	}
	}
	public int linearSearchIterative(Word word) {
		
	}
	public int linearSearchRecursive(Word word) {
		
	}
}
