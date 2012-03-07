#include <stdio.h>

int fibonachchi(int kolichestvo)
{
	if (kolichestvo <= 2) 
		return 1;
	else 
		return fibonachchi(kolichestvo - 1) + fibonachchi(kolichestvo - 2);
}

int main()
{
	int kolichestvo = 0;
	printf("Vvedite kolichestvo chisel \n");
	scanf("%d", &kolichestvo);
	printf("%d \n", fibonachchi(kolichestvo));
	return 0;
}