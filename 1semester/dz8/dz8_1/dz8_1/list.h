#pragma once

#include <string>

struct List;
struct ListElement;

// создает пустой список
List *createList();

// добавляет запись в список
void addEl(List *list, char *value);

// печатает список
void printList(List *list);

// сохраняет текущие данные в файл
void saveToFile(List *list);

// считывает список с файла
void readFromFile(List *list);

// очистищает выделенную под список память.
void delList(List *list);

// возвращет голову списка
ListElement *getHead(List *list);

// возвращает следующий за i элемент списка
ListElement *getNext(List *list, ListElement *i);

// возвращает количество элементов списка
int getCount(List *list);

// возвращает значение в элементе i списка
char *getValue(List *list, ListElement *i);