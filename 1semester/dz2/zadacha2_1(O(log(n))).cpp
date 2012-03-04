#include <stdio.h>

int involution(int number, int degree)
{
 
 if (degree != 1)
 {
	 if (degree % 2 == 1) 
	 {
		 int result = involution(number, (degree - 1) / 2);
		 return  result * result * number;
	 }
	 else
	 {
		 int result = involution(number, degree / 2);
		 return result * result;
	 }
 }
 else
	 return number;
}

int main()
{
 printf("Enter with keyboard number\n");
 int number = 0;
 scanf("%d", &number);
 printf("Enter with keyboard degree of number\n");
 int degree = 0;
 scanf("%d", &degree);
 printf("%d\n", involution(number, degree));
 return 0;
}