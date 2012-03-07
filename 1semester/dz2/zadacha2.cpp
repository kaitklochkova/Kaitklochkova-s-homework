#include <stdio.h>

int main()
{
	printf("Vvedite chislo\n");
	int chislo = 0;
	scanf("%d", &chislo);
	printf("Vvedite stepen chisla\n");
	int stepen = 0;
	scanf("%d", &stepen);
	int resultat = chislo;
	for (int i = 1; i < stepen; i++)
		resultat = resultat * chislo;
	printf("Resultat = %d \n", resultat);
	return 0;
}