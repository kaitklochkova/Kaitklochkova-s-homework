//Написать программу, печатающую все простые числа, не превосходящие заданного числа.

#include <stdio.h>
#include <math.h>

int main() {
    double n = 0;
    printf("Vvedite chislo");
    scanf("%lf", &n);
    for (int i = 2; i <= n; i++) {
        bool f = true;
        for (int j = 2; j <= sqrt(n); j++) {
            if (i != j && i % j == 0) {
                f = false;
                break;
            }
        }
        if (f) printf("%d \n", i);
    }
}