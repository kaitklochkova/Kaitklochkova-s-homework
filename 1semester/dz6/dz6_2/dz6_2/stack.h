#pragma once

struct Stack;

// ������� ������ ����
Stack *createStack();

// ��������� �������� value � ����
void push(Stack *stack, char value);

// ������� ������� �� �����
char pop(Stack *stack);

// �������� ����, ������ ��� ��������
void printStack(Stack *stack);

// ����������� ������� ������ ������
void delStack(Stack *stack);

// ���������� ������ �����
char headValue(Stack *stack);