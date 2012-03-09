/*��������� ������� ������������� ���� � ������ � ������� ���-�������. �� ����� ���� � �������, ������� �� ������� ��� �����, ������������� � ���� ������ � ����������� ���, 
������� ����������� ������ �����. ������ ��������� ������������������ ��������, ���������� ���������, ������ ���������� ��������� ������� �������. 
���-������� ����������� � ��������� ������, ������������ ������ "������".*/
#include <stdio.h>
#include <locale.h>
#include <string.h>
#include "hash.h"
#include "list.h"

int main()
{
	setlocale(LC_ALL, "Russian");
	Hash *hash = createHash();
	char *word = new char[1000];
	FILE * f = fopen("text.txt", "r");
	while (!feof(f))
	{
		fscanf(f, "%s", word);
		addHash(word, hash);
	}
	fclose(f);
	printHash(hash);
	delete[] word;
	delHash(hash);
	return 0;
}