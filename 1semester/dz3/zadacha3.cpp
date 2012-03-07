#include <stdio.h>
#include <stdlib.h>

void swap(int * a, int i1, int i2)
{
	a[i1] = a[i1] + a[i2];
	a[i2] = a[i1] - a[i2];
	a[i1] = a[i1] - a[i2];
}

int div(int * arr, int i, int counter)
{   
	int mediana = (arr[i] + arr[counter]) / 2;
	while (counter != i)
	{
		if (arr[i] > mediana)
		{
			swap(arr, counter, i);
			counter--;
		}
		else
			i++;
	}
	if (arr[i] < mediana)
		++i;
	return i;
}

void inserts(int * arr, int begin, int end)
{
	for (int i = 1; i < end - begin + 1; i++)
		for (int j = i; j > 0; j--)
		{
			if (arr[begin + j - 1] > arr[begin + j])
			swap(arr, begin + j - 1, begin + j);
		}
}

void qsort(int * arr, int begin, int end)
{
	if (begin + 10 < end)
	{ 
		int t = div(arr, begin, end);
		qsort(arr, begin, t - 1);
		qsort(arr, t, end);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	else
		inserts(arr, begin, end);
}

void searchMax(int * a, int max, int number, int value, int maxValue, int numberOfElementsInAnArrayA)
{
	for (int i = 1; i < numberOfElementsInAnArrayA; i++)
	{
		if (value == a[i] || i != numberOfElementsInAnArrayA - 1)
			number = number + 1;
		else
		{
			value = a[i];
			if (number > max)
			{
				maxValue = a[i - 1];
				max = number;
			}
			number = 1;
		}
	}
	printf("\nThe most common element in the array %d\n", maxValue);
}

int main()
{
	int const numberOfElementsInAnArrayA = 30;
	int a[numberOfElementsInAnArrayA];
	for (int i = 0; i < numberOfElementsInAnArrayA; i++)
		a[i] = rand() % 100;
	for (int i = 0; i < numberOfElementsInAnArrayA; i++)
		printf("%d ", a[i]);
	printf("\n");

	qsort(a, 0, numberOfElementsInAnArrayA - 1);

	for (int i = 0; i < numberOfElementsInAnArrayA; i++)
		printf("%d ", a[i]);
	
	searchMax(a, 1, 1, a[0], a[0], 30);
	
	return 0;
}