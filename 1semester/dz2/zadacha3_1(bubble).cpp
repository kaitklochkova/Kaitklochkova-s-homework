#include <stdio.h>

int main()
{
	int const n = 10;
	int a[n] = {0, 9, 5, 7, 3, 7, 0, 0, 4, 9};
	for (int i = 0; i < n; i++)
		for (int j = n-1; j > i; j--)
			if (a[j-1] > a[j])
			{
				a[j] = a[j] + a[j-1];
				a[j-1] = a[j] - a[j-1];
				a[j] =  a[j] - a[j-1];
			}
	printf("Sorted array in ascending order: \n");
	for (int i = 0; i < 10; i++)
		printf("%d \n", a[i]);
	return 0;
}