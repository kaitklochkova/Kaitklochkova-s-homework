#pragma once

struct List;

// ������� ������
List *createList(); 

// ��������� �������, ������������� � ������������, � ������������� ������
void add (List *list);

// ������� �������, �������� �������� ������������� � ������������, �� ������
void delEl(List *list);

// �������� ������
void print(List *list);

// ������� ������
void delList(List *list);