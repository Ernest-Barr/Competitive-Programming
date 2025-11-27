#include "util/solution.h"

int smallestRepunitDivByK(int k) {
    int res = 1;

    for (int i = 1; i <= k; ++i) {
        if (res % k == 0) return i;
        res = ((res * 10) + 1) % k;
    }

    return -1;
}
