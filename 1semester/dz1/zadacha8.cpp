//Заданы две строки: S и S1. Найти количество вхождений S1 в S как подстроки.
#include <stdio.h>
#include <string.h>

int main() {
    int k = 0;
    int j = 1;
    char* s = "qwehjgjhggqwekhkjqwe";
    char* s1 = "qwe";
    for (int i = 0; i <= strlen(s); i++) {
        bool f = true;
        if (s[i] == s1[1]) while (j <= strlen(s1)) {
                if (s[i + j] != s1[j]) f = false;
                j = j + 1;
            }
        if (f) k = k + 1;
    }
    printf("%d", k);
}