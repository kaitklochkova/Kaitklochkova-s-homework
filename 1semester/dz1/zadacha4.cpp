#include <stdio.h>
#include <math.h>

int thePartialQuotientForNonnegativeNumbers(int a, int b) {
    int result = 0;
    while (abs(b) <= abs(a)) {
        a = abs(a) - abs(b);
        result++;
    }
    return result;
}

int main() {
    int i = 0;
    int a = 0;
    int b = 0;
    printf("Vvedite chisla a & b cherez zapyatyu. \n");
    scanf("%d, %d", &a, &b);
    printf(" a = %d \n b = %d \n", a, b);
    if (b != 0) {
        if (a * b > 0)
            i = thePartialQuotientForNonnegativeNumbers(a, b);
        else {
            i = -thePartialQuotientForNonnegativeNumbers(a, b);
        }
        printf("Nepolnoe chastnoe a/b = %d \n", i);
    }
    return 0;
}