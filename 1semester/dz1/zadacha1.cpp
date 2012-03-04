#include <stdio.h>

int main()
{
	int x = 2;
	int sum = 0;
	scanf("%c", &x); 
	int sqrX = x * x;
	sum = (sqrX + 1)*(sqrX + x);
	printf("%d \n", sum);
}