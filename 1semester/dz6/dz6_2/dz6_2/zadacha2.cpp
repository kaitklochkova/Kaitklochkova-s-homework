/*�������� ��������� ��� ���������� ��������������� ��������� � ����������� �����. � ���������� �������� ������������������ ���� (��� ��������) � �������� 
+, -, *, /, �������������� ��������� � ����������� �����, ������ ���������� ��������� ����������. ��������, �� ����� 9 6 - 1 2 + * 
������ ���������� 9.*/

#include "stack.h"
#include <stdio.h>
#include <string.h>
#include <locale.h>

// ��������� �������� sign ��� a � b
int calculation(int a, int b, char sign)
{
	if (sign == '+')
		return a + b;
	if (sign == '-')
		return a - b;
	if (sign == '*')
		return a * b;
	if (sign == '/')
		return a / b;
}

// ��������� �������� ��������� � stack'e � ���������� ����� 
int calculationPostfixForm(char *str, Stack *tempStack, int i)
{
	int result = 0;
	int a = 0;
	if (str[i] != '+' && str[i] != '-' && str[i] != '*'  && str[i] != '/')
	{
		a = str[i] - 48;
			i++;
		if (str[i] != '+' && str[i] != '-' && str[i] != '*'  && str[i] != '/')
		{
			int b = str[i] - 48;
				i++;
			char sign = str[i];
				i++;
			result = calculation(a, b, sign);
			push(tempStack, result + 48);
		}
		else	
		{
			result = calculation(headValue(tempStack) - 48, a, str[i]);
				i++;
			pop(tempStack);
			push(tempStack, result + 48);
		}
	}
	else
	{
		a = headValue(tempStack) - 48;
		pop(tempStack);
		result = calculation(headValue(tempStack) - 48, a, str[i]);
			i++;
		pop(tempStack);
		push(tempStack, result + 48);
	}
	if (i < strlen(str))
		result = calculationPostfixForm(str, tempStack, i);
	return result;
}

int main()
{
	setlocale(LC_ALL, "Russian");
	char *str = "96-12+*";
	Stack *tempStack = createStack();
	int i = 0;
	printf("%d\n", calculationPostfixForm(str, tempStack, i));
	delStack(tempStack);
	return 0;
}