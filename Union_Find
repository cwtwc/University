/*
Author: Wein Wong

Date: January 21, 2015

Description: An implementation of Union-Find data structure.
There are n computers, which must be connected so that data can be sent between them.
Two operations are performed: One that connects two computers if they are not in the same component
and the other that prints "T" if the computers are in the same component and "F" otherwise.

Implementation: The variable op determines whether (1) the computers become connected,
(2) determined if connected or otherwise, or (3) causes the program to end.
If op is not -1, then the program checks if the computers are connected.
When op == 0 and if the computers are not connected, then the implemented weighted quick-union algorithm connects them.
When op == 1, the computers are determined as either connected or otherwise via path compression and equating associated roots.
When op == -1, the program quits.

Complexity: Worst case time is (M + N) lg* N
*/

#include "Union_Find.h"
#include <iostream>

using namespace std;

// Compile-time constant
static const int size = 10000;

// Constructor
UnionFind::UnionFind(int size)
{
	id = new int[size];		// Array that has an entry for each object
	sz = new int[size];		// Array that maintains the amount of nodes in tree
	for (int i = 0; i < size; i++)
	{
		id[i] = i;
		sz[i] = 1;
	}
}

// Destructor
UnionFind::~UnionFind()
{
	delete[] id;
	delete[] sz;
}

// Path compression by halving: Returns root value by having each link skip to the next node in the path up the tree
int UnionFind::Find(int x)
{
	for (x; x != id[x]; x = id[x])
	{
		id[x] = id[id[x]];
	}
	return x;
}

// Weighted quick-union algorithm; keeps track of the amount of nodes in each tree, links the smaller tree to the larger tree
void UnionFind::Union(int x, int y)
{
	int i = Find(x);		// Finds root values
	int j = Find(y);		
	if (i == j) return;		// Computers are already connected
	if (sz[i] < sz[j])		// Connects smaller tree to larger tree
	{
		id[i] = j;
		sz[j] += sz[i];
	}
	else
	{
		id[j] = i;
		sz[i] += sz[j];
	}
}

// Checks if there is a connection between computers
bool UnionFind::Connected(int x, int y)
{
	return Find(x) == Find(y);
}

int main(void)
{
	int n;
	int op, x, y;
	cout << "Enter value for n (number of computers): ";
	cin >> n;
	cout << "You may continuously enter values for op, x, and y with the format \"op x y\": " << endl;
	UnionFind *uf = new UnionFind(n);
	// User manually inputs op, x, and y to connect and determine if connected computers, or quit program
	while (cin >> op >> x >> y)
	{
		// Program quits
		if (op == -1 && x == -1 && y == -1) break;
		// If computers are not connected, they become connected
		if (!op)
		{
			if (!uf->Connected(x, y))
			{
				uf->Union(x, y);
			}
		}
		// Prints whether computers are connected (T) or otherwise (F)
		else
		{
			if (uf->Connected(x, y))
			{
				cout << "T" << endl;
			}
			if (!uf->Connected(x, y))
			{
				cout << "F" << endl;
			}
		}
	}
	uf->~UnionFind();
	return 0;
}
