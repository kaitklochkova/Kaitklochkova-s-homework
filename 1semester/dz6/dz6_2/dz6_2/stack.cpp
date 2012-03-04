#include "stack.h"
#include <stdio.h>
#include <string.h>
#include <locale.h>

struct StackElement
{
	char value;
	StackElement *next;
};

struct Stack
{
	StackElement *head;
};

Stack *createStack()
{
	Stack *result = new Stack;
	result->head = NULL;
	return result;
}

void push(Stack *stack, char value)
{
	StackElement *newHead = new StackElement;
	newHead->next = stack->head;
	newHead->value = value;
	stack->head = newHead;
}

char pop(Stack *stack)
{
	if (stack->head != NULL)
	{
		char result = stack->head->value;
		StackElement *temp = stack->head;
		stack->head = stack->head->next;
		delete temp;
		return result;
	}
	else
	{
		printf("Стек пустой!");
		return '0';
	}
}

void printStack(Stack *stack)
{
	while (stack->head != NULL)
	{
		printf("%c\n", stack->head->value);
		pop(stack);
	}
}

void delStack(Stack *stack)
{
	StackElement *temp = stack->head;
	while (temp != NULL)
	{
		stack->head = stack->head->next;
		delete temp;
		temp = stack->head;
	}
	delete stack;
}

char headValue(Stack *stack)
{
	return stack->head->value;
}