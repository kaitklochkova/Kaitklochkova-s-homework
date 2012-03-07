#include <stdio.h>

int main() {
    int k = 0;
    int a[10] = {0, 0, 1, 2, 0, 2, 5, 6, 0, 0};
    for (int i = 0; i < 10; i++)
        if (a[i] == 0) k = k + 1;
    printf("V dannom massive %d nylevyh elementov \n", k);
}