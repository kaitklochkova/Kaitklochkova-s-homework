/*Посчитать частоты встречаемости слов в тексте с помощью хеш-таблицы. На входе файл с текстом, вывести на консоль все слова, встречающиеся в этом тексте с количеством раз, 
которое встречается каждое слово. Словом считается последовательность символов, разделённая пробелами, разные словоформы считаются разными словами. 
Хеш-таблицу реализовать в отдельном модуле, использующем модуль "Список".*/
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