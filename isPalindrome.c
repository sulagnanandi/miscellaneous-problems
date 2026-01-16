#include <stdint.h>
#include <stdio.h>
#include <stdbool.h>

bool isPalindrome(int x) {
    if (x<0) return false;
    if (x>=0 && x<10) return true;
    
    int reverse = 0;
    int temp = x;
    while(temp != 0){
        reverse = reverse*10 + (temp % 10);
        temp /= 10;
    }

    if (reverse == x){
        return true;
    }

    return false;
}

int main(void){
    bool isPalindromeBool = isPalindrome(1001);
    printf("Result of isPalindrome = %d\n",isPalindromeBool);
    // if(isPalindromeBool){
    //     printf("palindrome");
    // } else {
    //     printf("not palindrome");
    // }
}