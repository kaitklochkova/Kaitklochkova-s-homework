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

void insetrs(int * arr, int begin, int end)
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
		insetrs(arr, begin, end);
}

int binarySearch(int * a, int m, int n)
{
	int begin = 0;
	int end = n;
	while (begin < end)
	{
		int indexmid = (end + begin) / 2;
		if (m == a[indexMid])
			return a[indexMid];
		if (m > a[indexMid])
			begin = indexMid + 1;
		else
			end = indexMid;
	}
	return -1;
}

int main()
{
	printf("Enter the number 1 <= n <= 5000\n");
	int n = 0;
	scanf("%d", &n);
	int nArray[5000];
	for (int i = 0; i < n; i++)
		nArray[i] = rand() % 10^9;
	for (int i = 0; i < n; i++)
		printf("%d ", nArray[i]);
	printf("\n");
	printf("Enter the number 1 <= k <= 300000\n");
	int k = 0;
	scanf("%d", &k);

	qsort(nArray, 0, n - 1);
	
	for (int i = 0; i < k; i++)
	{
		int intNumber = rand() % 10^9;
		if (binarySearch(nArray, intNumber, n) == intNumber)
			printf("%d is in array\n", intNumber);
		else
			printf("%d doesn't in array\n", intNumber);
	}
	return 0;
}