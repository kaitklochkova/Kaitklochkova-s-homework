//„ан массив целых чисел x[1]...x[m+n], рассматриваемый как соединение двух его отрезков: начала x[1]...x[m] длины m и конца x[m+1]...x[m+n] длины n. Не используя дополнительных массивов, переставить начало и конец.

#include <stdio.h>

int* Mirror(int begin, int end, int x[]) {
    for (int i = begin; i < begin + (end - begin) / 2; i++) {
        x[i] = x[begin + end - i] + x[i];
        x[begin + end - i] = x[i] - x[begin + end - i];
        x[i] = x[i] - x[begin + end - i];
    }
    return x;
}

int main() {
    const int m = 5;
    const int n = 6;
    int x[m + n];
    for (int i = 0; i <= m + n - 1; i++) {
        x[i] = i;
    }
    Mirror(0, m - 1, x);
    Mirror(m, m + n - 1, x);
    Mirror(0, m + n - 1, x);
    for (int i = 0; i <= m + n - 1; i++) {
        printf("%d \n", x[i]);
    }
}