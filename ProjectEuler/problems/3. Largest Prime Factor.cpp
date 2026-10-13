#include "util.h"

int main() {
    u64 num = 600851475143;
    u64 res = 0;

    // If the num is even, factor out all multiples of 2 since 2 is prime.
    while (num % 2 == 0) {
        num /= 2;
        res = 2;
    }

    // The rest of the primes are odd, so we have to factor out all odd primes.
    // Factor out all odd primes and their multiples
    for (u64 p = 3; p * p <= num; p += 2) {
        while (num % p == 0) {
            res = p;
            num /= p;
        }
    }

    if (num > 1) res = num;

    std::cout << res << std::endl;
}