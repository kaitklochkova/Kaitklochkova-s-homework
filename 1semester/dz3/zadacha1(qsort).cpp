#include <stdio.h>
#include <stdlib.h>

int swap(int * a, int i1, int i2)
{
	a[i1] = a[i1] + a[i2];
	a[i2] = a[i1] - a[i2];
	a[i1] = a[i1] - a[i2];
	return 0;
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

int qsort(int * arr, int begin, int end)
{
	if (begin + 10 < end)
	{ 
		int t = div(arr, begin, end);
		qsort(arr, begin, t - 1);
		qsort(arr, t, end);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	else
	{
		for (int i = 1; i < end - begin + 1; i++)
			for (int j = i; j > 0; j--)
			{
				if (arr[begin + j - 1] > arr[begin + j])
					swap(arr, begin + j - 1, begin + j);
			}
	}
	return 0;
}

int main()
{
	int const numberOfElementsInAnArrayA = 30;
	int a[numberOfElementsInAnArrayA];
	for (int i = 0; i < numberOfElementsInAnArrayA; i++)
		a[i] = rand() % 100;
	for (int i = 0; i < numberOfElementsInAnArrayA; i++)
		printf("%d \n", a[i]);
	printf("\n");

	qsort(a, 0, numberOfElementsInAnArrayA - 1);
	
	for (int i = 0; i < numberOfElementsInAnArrayA; i++)
		printf("%d \n", a[i]);
}