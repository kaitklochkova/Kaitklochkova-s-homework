#pragma once

#include <string>

struct List;
struct ListElement;

// ������� ������ ������
List *createList();

// ��������� ������ � ������
void addEl(List *list, char *value);

// �������� ������
void printList(List *list);

// ��������� ������� ������ � ����
void saveToFile(List *list);

// ��������� ������ � �����
void readFromFile(List *list);

// ���������� ���������� ��� ������ ������.
void delList(List *list);

// ��������� ������ ������
ListElement *getHead(List *list);

// ���������� ��������� �� i ������� ������
ListElement *getNext(List *list, ListElement *i);

// ���������� ���������� ��������� ������
int getCount(List *list);

// ���������� �������� � �������� i ������
char *getValue(List *list, ListElement *i);