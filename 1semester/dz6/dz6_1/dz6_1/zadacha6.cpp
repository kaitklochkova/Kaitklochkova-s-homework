#include "list.h"
#include <stdio.h>
#include <locale.h>
#include <string>
#include <iostream>
#include <fstream>
#include <io.h>
using namespace std;

TelephoneDirectory *merge(TelephoneDirectory *telephoneDirectory1, TelephoneDirectory *telephoneDirectory2, char chooseNameOrTel)
{
	TelephoneDirectory *sortedTelephoneDirectory = createTelephoneDirectory();
	DataAboutMen *i1 = getHead(telephoneDirectory1);
	DataAboutMen *i2 = getHead(telephoneDirectory2);
	while (getCount(sortedTelephoneDirectory) < getCount(telephoneDirectory1) + getCount(telephoneDirectory2) && i1 != NULL && i2 != NULL)
	{
		if (chooseNameOrTel == 'n')
			if (getName(telephoneDirectory1, i1) < getName(telephoneDirectory2, i2))
			{
				add(sortedTelephoneDirectory, getName(telephoneDirectory1, i1), getTel(telephoneDirectory1, i1));
				i1 = getNext(telephoneDirectory1, i1);
			}
			else
			{
				add(sortedTelephoneDirectory, getName(telephoneDirectory2, i2), getTel(telephoneDirectory2, i2));
				i2 = getNext(telephoneDirectory2, i2);
			}
		else
			if (getTel(telephoneDirectory1, i1) < getTel(telephoneDirectory2, i2))
			{
				add(sortedTelephoneDirectory, getName(telephoneDirectory1, i1), getTel(telephoneDirectory1, i1));
				i1 = getNext(telephoneDirectory1, i1);
			}
			else
			{
				add(sortedTelephoneDirectory, getName(telephoneDirectory2, i2), getTel(telephoneDirectory2, i2));
				i2 = getNext(telephoneDirectory2, i2);
			}
	}
	if (i1 != NULL)
		while (i1 != NULL)
		{
			add(sortedTelephoneDirectory, getName(telephoneDirectory1, i1), getTel(telephoneDirectory1, i1));
			i1 = getNext(telephoneDirectory1, i1);
		}
	if (i2 != NULL)
		while (i2 != NULL)
		{
			add(sortedTelephoneDirectory, getName(telephoneDirectory2, i2), getTel(telephoneDirectory2, i2));
			i2 = getNext(telephoneDirectory2, i2);
		}
 	return sortedTelephoneDirectory;
}

TelephoneDirectory *mergeSort(TelephoneDirectory *telephoneDirectory, char chooseNameOrTel)
{
	TelephoneDirectory *telephoneDirectory1 = createTelephoneDirectory();
	TelephoneDirectory *telephoneDirectory2 = createTelephoneDirectory();
	int n = getCount(telephoneDirectory) / 2;
	DataAboutMen *i = getHead(telephoneDirectory);
	for (int j = 0; j < n; j++)
	{
		add(telephoneDirectory1, getName(telephoneDirectory, i), getTel(telephoneDirectory, i));
		i = getNext(telephoneDirectory, i);
	}
	for (int j = getCount(telephoneDirectory) / 2; j < getCount(telephoneDirectory); j++)
	{
		add(telephoneDirectory2, getName(telephoneDirectory, i), getTel(telephoneDirectory, i));
		i = getNext(telephoneDirectory, i);
	}
	TelephoneDirectory *sortedTelephoneDirectory1 = createTelephoneDirectory();
	TelephoneDirectory *sortedTelephoneDirectory2 = createTelephoneDirectory();	
	if (getCount(telephoneDirectory1) > 1)
		sortedTelephoneDirectory1 = mergeSort(telephoneDirectory1, chooseNameOrTel);
	else
		add(sortedTelephoneDirectory1, getName(telephoneDirectory1, getHead(telephoneDirectory1)), getTel(telephoneDirectory1, getHead(telephoneDirectory1)));
	if (getCount(telephoneDirectory2) > 1)
		sortedTelephoneDirectory2 = mergeSort(telephoneDirectory2, chooseNameOrTel);
	else
		add(sortedTelephoneDirectory2, getName(telephoneDirectory2, getHead(telephoneDirectory2)), getTel(telephoneDirectory2, getHead(telephoneDirectory2)));
	TelephoneDirectory *resultMergeSort = merge(sortedTelephoneDirectory1, sortedTelephoneDirectory2, chooseNameOrTel); 
	delTelephoneDirectory(sortedTelephoneDirectory1);
	delTelephoneDirectory(sortedTelephoneDirectory2);
	return resultMergeSort;
}

int main()
{
	setlocale(LC_ALL, "Russian");
	TelephoneDirectory *telephoneDirectory = createTelephoneDirectory();
	if (access("telephone base.txt", 00) == 0)
		readFromFile(telephoneDirectory);
	else
		cout << "Файла нет. База пустая.\n";
	char chooseNameOrTel = ' ';
	cout << "Нажмите:\n0 - выйти\nn - сортировка по имени\nt - сортировка по телефону\n";
	while (chooseNameOrTel != '0')
	{
		cin >> chooseNameOrTel;
		if (chooseNameOrTel == 'n')
		{
			cout << "Список, отсортированный по имени\n";
			printTelephoneDirectory(mergeSort(telephoneDirectory, chooseNameOrTel));
		}		
		if (chooseNameOrTel == 't')
		{
			cout << "Список, отсортированный по телефону\n";
			printTelephoneDirectory(mergeSort(telephoneDirectory, chooseNameOrTel));
		}
	}
	delTelephoneDirectory(telephoneDirectory);
	return 0;
}