/*you are required to write a basic program with a menu and such that can take two numbers and a basic math operation (+, -, *, /) and give the result.(5pts)
 
You need to make your program uncrashable (catching and handling std exceptions as appropriate) with informative feedback while staying logically consistent. If an invalid operator is entered, the program should indicate this and ask for another entry.(3pts) You should manually have that class throw exceptions for bad inputs as appropriate. In particular, dividing by zero(1pt)
 
The calculation methods should be in a separate class from the menu code.(1pt)
 
It's totally reasonable for you to ask for the operator separately from the numbers, though it would be better that the actual text of the operator be entered by the user.(1 bonus pt)*/


#include <iostream>
#include <cstdlib>

#include "Calculator.h"

using namespace std;

/*void displayResult(float num1, char oper, float num2);

float num1, num2, sol;
char oper;
bool finished = false;


int main ()
{
    cout << "Calculator\n\n";

    while(!finished)
    {
    cout << "Enter a math operator (+, -, *, or /) or enter Q to quit Calculator: ";
    cin >> oper;

    if(oper == 'Q' || oper == 'q')
    	break;

	cout << "\nEnter a number: ";
	cin >> num1;
		cout << "So far, we have " << num1 << " " << oper << " ___. To complete the operation, enter another number: ";
	cin >> num2;
	if(oper == '/' && num2 == 0)
				  cout << "You cannot divide by zero. Try again from the beginning: " << "\n\n";
	if(!(num2 >= 0 || num2 < 0))
			 cout << "You must input a number. Try again from the beginning: " << "\n\n";
    if(oper == '+' || oper == '-' || oper == '*' || oper == '/')
                  displayResult(num1, oper, num2);
    if(!(num1 >= 0 || num1 < 0))
    			 cout << "You must input a number. Try again from the beginning: " << "\n\n";
    else
    cout << "Your input is not a valid operation. Re-read the instructions." << "\n\n";
    }

	cout << "\nGoodbye.";
}
*/
void displayResult(float num1, char oper, float num2)
{
     switch (oper)
          {
                  case '+': cout << num1 << " + " << num2 << " = " << num1 + num2 << endl;
                  break;

                  case '-': cout << num1 << " - " << num2 << " = " << num1 - num2 << endl;
                  break;

                  case '*': cout << num1 << " * " << num2 << " = " << num1 * num2 << endl;
                  break;

                  case '/': if (num2 == 0)
                            	cout << "\nCannot divide by zero. Try again from the beginning: " << endl;

                            else
                                cout << num1 << " / " << num2 << " = " << num1 / num2 << endl;
                  break;

                  default: cout << "You did not use one of the four valid operators. Re-read the instructions." << endl;
                  break;
          }
}
