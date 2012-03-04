#include <stdio.h>

int main()
{
	int const n = 10;
	int a[n] = {0, 0, 7, 0, 4, 9, 3, 9, 5, 7};
	int const numberOfElementsInAnArrayAmount = 10;
	int amount[numberOfElementsInAnArrayAmount];
	for (int i = 0; i < numberOfElementsInAnArrayAmount; i++)
		amount[i] = 0;
	for (int i = 0; i < n; i++)
		amount[a[i]]++;
	int number = 0;
	for (int i = 0; i < numberOfElementsInAnArrayAmount; i++)
		for (int j = 0; j < amount[i]; j++)
		{
			a[number] = i;
			number = number + 1;
		}
	for (int i = 0; i <= 9; i++)
		printf("%d\n", a[i]);
	return 0;
}