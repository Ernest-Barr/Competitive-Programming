#include "util/solution.h"

bool isPalindrome(int x) {
    if (x < 0) return false;

    long long reversed = 0;

    int cpy = x;

    while (cpy != 0) {
        reversed *= 10;
        reversed += cpy % 10;
        cpy /= 10;
    }

    return reversed == x;
}
