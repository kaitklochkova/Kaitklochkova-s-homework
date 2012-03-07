#include <stdio.h>

int main()
{
	int kolichestvo = 0;
	printf("Vvedite kolichestvo chisel \n");
	scanf("%d", &kolichestvo);
	int n[3] = {0, 1, 1};
	printf("\n%d chisla Fibonachchi \n\n", kolichestvo);
	for (int i = 0; i < kolichestvo - 2; i++)
	{
		n[0] = n[1] + n[2];
		n[1] = n[2];
		n[2] = n[0];
	}
	printf("%d \n", n[2]);
	return 0;
}
