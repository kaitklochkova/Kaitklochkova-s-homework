#include <stdio.h>
#include <string.h>

int main() {
    int count = 0;
    char* str = "(((()((((()))";
    for (int i = 0; i < strlen(str); i++) {
        if (str[i] == '(')
            count = count + 1;
        else
            count = count - 1;
        if (count < 0)
            break;
    }
    if (count == 0)
        printf("Balans skobok soblyuden. \n");
    else
        printf("Balans skobok ne soblyuden! \n");
}