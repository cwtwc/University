#ifndef PERSON_H_
#define PERSON_H_

#include <string>

using namespace std;

class Person
{

//Public types and variables
public:
	Person(string first, string last, int age, int friendCap);
	//Constructor which stores person's first name, last name, their age, and their friend capacity (capacity for maintaining friendships quantified)

	~Person();

	bool add(Person* p);
	string toSimpleString();
	string toFullString();
	string getFirstName();
	string getLastName();
	int getAge();
	int getFriendCap();
	Person** getFriendList(int& size);
	bool isCapped();
	Person** getUncappedFriends(int& size);

//Private types and variables
private:
    string first;
    string last;
    int age;
    int friendCap;
    int cap;
    Person** friendList;
};

#endif
