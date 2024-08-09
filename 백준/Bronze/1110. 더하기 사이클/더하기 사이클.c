#include <stdio.h>

int main() {
    char N, T, new; 
    int count=0;
    scanf("%hhd", &N);
    new = N;

    while(1) {
        T = N/10 + N%10;
        N = N%10*10 + T%10;
        count++;
        if(N==new) break;
    }
    printf("%d", count);
}