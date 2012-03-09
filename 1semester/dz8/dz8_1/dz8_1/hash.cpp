#include <stdio.h>
#include <string.h>
#include "list.h"
#include "hash.h"

struct Hash
{
	List *bucket[100];
};

Hash *createHash()
{
	Hash *hash = new Hash;
	for (int i = 0; i < 100; i++)
		hash->bucket[i] = createList();
	return hash;
}

int hashFun(char *str)
{
	int temp = 0;
	for (int i = 0; i < strlen(str); i++)
	{
		temp = abs(temp*101 + str[i]);
	}
	return temp;
}

void addHash(char str[], Hash *hash)
{
	int index = hashFun(str) % 100;
	addEl(hash->bucket[index], str);
}

void printHash(Hash * hash)
{
	for (int i = 0; i < 100; i++)
		printList(hash->bucket[i]);
}

void delHash(Hash *hash)
{
	for (int i = 0; i < 100; i++)
		delList(hash->bucket[i]);
}