#include <stdio.h>
#include <locale.h>
#include <string>
#include <iostream>
#include <fstream>
#include <io.h>
using namespace std;

struct DataAboutMen
{
	string name;
	int tel;
	DataAboutMen *next;
};

struct TelephoneDirectory
{
	DataAboutMen *head;
	DataAboutMen *tail;
	int count;
};

TelephoneDirectory *createTelephoneDirectory()
{
	TelephoneDirectory *telephoneDirectory = new TelephoneDirectory;
	telephoneDirectory->head = NULL;
	telephoneDirectory->tail = NULL;
	telephoneDirectory->count = 0;
	return telephoneDirectory;
}

void add(TelephoneDirectory *telephoneDirectory, string name, int tel)
{
	DataAboutMen *newRecord = new DataAboutMen;
	newRecord->name = name;
	newRecord->tel = tel;
	newRecord->next = NULL;
	if (telephoneDirectory->head != NULL)
		telephoneDirectory->tail->next = newRecord;
	else
		telephoneDirectory->head = newRecord;
	telephoneDirectory->tail = newRecord;
	telephoneDirectory->count++;
}

void foundByName(TelephoneDirectory *telephoneDirectory, string foundName)
{
	DataAboutMen *i = telephoneDirectory->head;
	bool flag = false;
	while (i != NULL)
	{
		if (i->name == foundName)
		{
			cout << i->tel;
			cout << "\n";
			flag = true;
			break;
		}
		else
			i = i->next;
	}
	if (!flag)
		cout << "Такого имени в базе нет\n";
}

void foundByTel(TelephoneDirectory *telephoneDirectory, int foundTel)
{
	DataAboutMen *i = telephoneDirectory->head;
	bool flag = false;
	while (i != NULL)
	{
		if (i->tel == foundTel)
		{
			cout << i->name;
			cout << "\n";
			flag = true;
			break;
		}
		else
			i = i->next;
	}
	if (!flag)
		cout << "Такого телефона в базе нет\n";
}

void printTelephoneDirectory(TelephoneDirectory *telephoneDirectory)
{
	DataAboutMen *i = telephoneDirectory->head;
	while (i != NULL)
	{
		cout << i->name;
		cout << ' ';
		cout << i->tel;
		cout << "\n";
		i = i->next;
	}
}

void saveToFile(TelephoneDirectory *telephoneDirectory)
{
	ofstream outFile("telephone base.txt");
	DataAboutMen *i = telephoneDirectory->head;
	while (i != NULL)
	{
		outFile << i->name;
		outFile << ' ';
		outFile << i->tel;
		outFile << '\n';
		i = i->next;
	}
	cout << "Данные сохранены в файл telephone base.txt \n";
	outFile.close();
}

void readFromFile(TelephoneDirectory *telephoneDirectory)
{
	ifstream inFile("telephone base.txt");
	while (!inFile.eof())
	{
		string name = " ";
		inFile >> name;
		int tel = 0;
		inFile >> tel;
		add(telephoneDirectory, name, tel);
	}
	inFile.close();
}

void delTelephoneDirectory(TelephoneDirectory *telephoneDirectory)
{
	DataAboutMen *temp = telephoneDirectory->head;
	while (temp != NULL)
	{
		telephoneDirectory->head = telephoneDirectory->head->next;
		delete temp;
		temp = telephoneDirectory->head;
	}
	telephoneDirectory->tail = NULL;
	delete telephoneDirectory;
}

DataAboutMen *getHead(TelephoneDirectory *telephoneDirectory)
{
	return telephoneDirectory->head;
}

DataAboutMen *getNext(TelephoneDirectory *telephoneDirectory, DataAboutMen *i)
{
	return i->next;
}

string getName(TelephoneDirectory *telephoneDirectory, DataAboutMen *i)
{
	return i->name;
}

int getTel(TelephoneDirectory *telephoneDirectory, DataAboutMen *i)
{
	return i->tel;
}

int getCount(TelephoneDirectory *telephoneDirectory)
{
	return telephoneDirectory->count;
}


