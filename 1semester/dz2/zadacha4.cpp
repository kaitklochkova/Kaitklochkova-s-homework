#include <stdio.h>
#include <stdlib.h>

int main()
{
	int const numberOfElementsInAnArrayA = 10;
	int a[numberOfElementsInAnArrayA];
	for (int i = 0; i < numberOfElementsInAnArrayA; i++)
		a[i]= rand();
	int counter = numberOfElementsInAnArrayA - 1;
	int i = 1;
		while (counter != i)
		{
			if (a[i] > a[1])
			{
				a[counter] = a[i] + a[counter];
				a[i] = a[counter] - a[i];
				a[counter] = a[counter] - a[i];
				counter = counter - 1;
			}
			else
				i = i + 1;
		}
		
	for (int i = 0; i < numberOfElementsInAnArrayA; i++)
		printf("%d\n", a[i]);
	return 0;
}