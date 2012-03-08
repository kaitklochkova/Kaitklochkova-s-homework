#pragma once

struct List;

// создает список
List *createList(); 

// добавляет элемент, запрашиваемый у пользователя, в сортированный список
void add (List *list);

// удаляет элемент, значение которого запрашивается у пользователя, из списка
void delEl(List *list);

// печатает список
void print(List *list);

// удаляет список
void delList(List *list);