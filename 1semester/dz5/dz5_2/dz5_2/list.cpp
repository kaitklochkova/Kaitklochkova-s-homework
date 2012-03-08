#include "list.h"
#include <stdio.h>
#include <string.h>
#include <locale.h>

struct ListElement
{
	int value;
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

void add (List *list)
{
		printf("¬ведите значение, которое необходимо добавить в отсортированный список\n");
		int valueForAdd = 0;
		scanf("%d", &valueForAdd);
		ListElement *newEl = new ListElement;
		ListElement *i = new ListElement;
		i = list->head;
		newEl->value = valueForAdd;
		while (i->next != NULL)
		{
			if (i->next->value <= valueForAdd)
				i = i->next;
			else
			{
				newEl->next = i->next;
				i->next = newEl;
				list->count++;
				break;
			}
		}
		if (i->next == NULL)
		{
			newEl->next = NULL;
			i->next = newEl;
			list->tail = newEl;
			list->count++;
		}
		printf("Ёлемент, со значением %d добавлен в список", valueForAdd);
		printf("\n");
}

void delEl(List *list)
{
	printf("¬ведите значение, которое необходимо удалить из списка\n");
	int valueForDel = 0;
	scanf("%d", &valueForDel);
	ListElement *i = new ListElement;
	i = list->head;
	while (i->next != NULL)
	{
		if (i->next == NULL)
		{
			if (i->next->value == valueForDel)
			{
				i->next = NULL;
				list->count--;
				list->tail = i;
			}
		}
		else
		{
			if (i->next->value == valueForDel)
			{
				i->next = i->next->next;
				list->count--;
			}
			else
				i = i->next;
		}
	}
	printf("Ёлементы, со значением %d удалены из списка", valueForDel);
	printf("\n");
}

void print(List *list)
{
	ListElement *i = new ListElement;
	i = list->head;
	printf("ѕолученный список: ");
	while (i->next != NULL)
	{
		i = i->next;
		printf("%d ", i->value);
	}
	printf("\n");
}

void delList(List *list)
{
	ListElement *temp = list->head;
	while (temp != NULL)
	{
		list->head = list->head->next;
		delete temp;
		temp = list->head;
		list->count--;
	}
	list->tail = NULL;
	delete list;
	printf("—писок удален\n");
}
