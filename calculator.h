you are required to write a basic program with a menu and such that can take two numbers and a basic math operation (+, -, *, /) and give the result.(5pts)
 
You need to make your program uncrashable (catching and handling std exceptions as appropriate) with informative feedback while staying logically consistent. If an invalid operator is entered, the program should indicate this and ask for another entry.(3pts) You should manually have that class throw exceptions for bad inputs as appropriate. In particular, dividing by zero(1pt)
 
The calculation methods should be in a separate class from the menu code.(1pt)
 
It's totally reasonable for you to ask for the operator separately from the numbers, though it would be better that the actual text of the operator be entered by the user.(1 bonus pt)

#include <iostream>
#include <cstdlib>

using namespace std;

void displayResult(float num1, char oper, float num2);

float num1, num2, sol;
char oper;
bool finished = false;

int main ()
{
    cout << "Calculator\n";

    while(!finished)
    {
    try {
    	cout << "\nEnter a math operator (+, -, *, or /) or enter Q to quit Calculator: ";
    	cin >> oper;

    	if(oper == 'Q' || oper == 'q')
    	break;

    	cout << "\nEnter a number: ";
    	cin >> num1;
    	if(cin.fail())
    		throw exception();
		cout << "\nSo far, we have " << num1 << " " << oper << " ___. To complete the operation, enter another number: ";
		cin >> num2;
		if(cin.fail())
			throw exception();

		if (oper == '+' || oper == '-' || oper == '*' || oper== '/')
            displayResult(num1, oper, num2);
		else
			cout << "\nYou did not use one of the four valid operators. Re-read the instructions." << "\n";
    }
    catch(exception e){
    	cout << "\nYour entry is not a number. Re-read the instructions." << endl;
    	cin.clear();
    	cin.ignore(100, '\n');
    	continue;
    }
}
cout << "\nGoodbye.";
}
