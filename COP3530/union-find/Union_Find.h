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

class UnionFind
{
	// data
	int size, *id, *sz;
	// methods
public:
	UnionFind(int);
	~UnionFind();
	int Find(int);
	void Union(int, int);
	bool Connected(int, int);
};
