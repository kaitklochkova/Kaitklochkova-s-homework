#pragma once

struct Stack;

// создает пустой стек
Stack *createStack();

// добавляет значение value в стек
void push(Stack *stack, char value);

// удаляет элемент из стека
char pop(Stack *stack);

// печатает стек, удаляя его элементы
void printStack(Stack *stack);

// освобождает занятую стеком память
void delStack(Stack *stack);

// возвращает голову стека
char headValue(Stack *stack);