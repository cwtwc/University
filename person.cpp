#include "person.h"
#include <iostream>
#include <string>
#include <sstream>

using namespace std;

Person::Person(string first, string last, int age, int friendCap) //Making variables accessible in order to execute the following methods
{
    //Variables
    this->first = first;
    this->last = last;
    this->age = age;
    this->friendCap = friendCap;
    int cap = 0;
    this->friendList = new Person*[this->friendCap];
        for (int i = 0; i < friendCap; i++)
            this->friendList[i] = NULL;
}

string Person::toSimpleString() //A string useful for visually representing the object
{
    ostringstream s1;
    s1 << first << " " << last << ", Age " << age << endl;
    string s2 = s1.str();
    return s2; //Returns string which contains information about the person's first name, last name, and age
}

bool Person::add(Person* p) //Attempts to add "p" to the person's friends list
{
    if(this != p && cap < friendCap) //Adding people to list of friends
    {
        friendList[cap] = p;
        cap++;
        return true; //If the person was added successfully, returns true
    }
    else
    {
        return false; //Otherwise, if the person was not added successfully, returns false
    }
}

string Person::toFullString() //A string useful for visually representing the object
{
    ostringstream s1;
    s1 << first << " " << last << ", Age " << age << endl;
    s1 << "Friends:" << endl;
    for(int i = 0; i < friendCap; i++) //For loop which stores the list of friends
    {
        Person** getFriendList(int& size);
        s1 << "\t" << first << " " << last << ", Age " << age << endl;
    }
    string s2 = s1.str();
    return s2; //Returns string which contains information about the person's first name, last name, age, and list of friends
}

string Person::getFirstName() //Getter method for first name
{
    return first;
}
string Person::getLastName() //Getter method for last name
{
    return last;
}
int Person::getAge() //Getter method for age
{
    return age;
}
int Person::getFriendCap() //Getter method for friend capacity
{
    return friendCap;
}

Person** Person::getFriendList(int& size)
{
    int add = 0;
    Person ** friendsList = new Person*[friendCap];

    for(int i = 0; i < friendCap; i++) //Determines friendship compatibility by observing friendship capacities
    {
        if (friendList[i] != NULL)
        {
        add++;
        friendsList[i] = friendList[i];
        }
    }

    if(add == friendCap)
    {
            size = friendCap;
    }
    else
    {
        size = add;
    }
    return friendsList; //Returns an array of all other Person objects the current one considers their friends based on friendship capacities
}

bool Person::isCapped() //Determines whether maximum capacity for friendship is attained or not
{
    int amountOfFriends;
    int friendList[4];
    Person* p;

    if(this != p && amountOfFriends == friendCap)
    {
        return true; //Person is at maximum friendship capacity so returns true
    }
    else
        return false; //Person is not at maximum friendship capacity so returns false
}

Person** Person::getUncappedFriends(int& size) //Returns an array of all friends of the current person with remaining friendship capacity
                                               //as well as the size of the array
{
    int add = 0;
    Person** friendshipList = new Person*[friendCap];

    for (int i = 0; i < friendCap; i++)
    {
        if (friendList[i]->isCapped() == false)
        {
             add++;
             friendshipList[i] = friendList[i];
        }
    }

    if (add == 0)
    {
        return NULL; //Returns nothing if the size is 0
    }

    else
    {
        size = add;
        return friendshipList; //Returns size of array
    }
}
