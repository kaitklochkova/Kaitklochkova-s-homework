#include <stdio.h>
#include <locale.h>
#include <string>
#include <iostream>
#include <fstream>
#include <io.h>
using namespace std;

struct ListElement
{
	char *value;
	int countOfEl;
	ListElement *next;
};

struct List
{
	ListElement *head;
	ListElement *tail;
	int count;
};

List *createList()
{
	List *list = new List;
	ListElement *guard = new ListElement;
	list->head = guard;
	list->tail = guard;
	guard->next = NULL;
	list->count = 0;
	return list;
}

void addEl(List *list, char *value)
{
	char *copy = new char[1000];
	for (int i = 0; value[i] != '\0'; ++i)
		copy[i] = value[i];
	copy[strlen(value)] = '\0';
	ListElement *newEl = new ListElement;
	newEl->value = copy;
	ListElement *i = list->head;
	while (i->next != NULL)
	{
		bool flagOfEqualityINextValueAndCopy = true;
		for (int j = 0; j < strlen(copy); j++)
			if (i->next->value[j] != copy[j])
				flagOfEqualityINextValueAndCopy = false;
		if (flagOfEqualityINextValueAndCopy)
		{
			i->next->countOfEl++;
			delete newEl;
			delete[] copy;
			break;
		}
		else
		{
			newEl->next = i->next;
			i->next = newEl;
			i->next->countOfEl = 1;
			list->count++;
			break;
		}
	}
	if (i->next == NULL)
		if (list->count == 0)
		{
			newEl->next = NULL;
			i->next = newEl;
			i->next->countOfEl = 1;
			list->tail = newEl;
			list->count++;
		}
		else 
		{
			bool flagOfEqualityIValueAndCopy = true;
			for (int j = 0; j < strlen(copy); j++)
				if (i->value[j] != copy[j])
					flagOfEqualityIValueAndCopy = false;
			if (flagOfEqualityIValueAndCopy)
			{
				i->next->countOfEl++;
				delete[] copy;
				delete newEl;
			}
			else
			{
				newEl->next = NULL;
				i->next = newEl;
				i->next->countOfEl = 1;
				list->tail = newEl;
				list->count++;
			}
		}
}

void printList(List *list)
{
	ListElement *i = list->head;
	while (i->next != NULL)
	{
		i = i->next;
		printf("%s (%d), ", i->value, i->countOfEl);
	}
}

void saveToFile(List *list)
{
	ofstream outFile("telephone base.txt");
	ListElement *i = list->head;
	while (i != NULL)
	{
		outFile << i->value;
		outFile << '\n';
		i = i->next;
	}
	cout << "Данные сохранены в файл telephone base.txt \n";
	outFile.close();
}

void readFromFile(List *list)
{
	ifstream inFile("telephone base.txt");
	while (!inFile.eof())
	{
		char *value = 0;
		inFile >> value;
		addEl(list, value);
	}
	inFile.close();
}

void delList(List *list)
{
	ListElement *temp = list->head;
	while (temp != NULL)
	{
		list->head = list->head->next;
		delete temp;
		temp = list->head;
	}
	list->tail = NULL;
	delete list;
}

ListElement *getHead(List *list)
{
	return list->head;
}

ListElement *getNext(List *list, ListElement *i)
{
	return i->next;
}

char *getValue(List *list, ListElement *i)
{
	return i->value;
}

int getCount(List *list)
{
	return list->count;
}


