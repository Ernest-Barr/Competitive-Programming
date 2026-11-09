#include "util.h"

// math.stackexchange.com/questions/264544/how-to-find-number-of-prime-numbers-up-to-to-n
// https://gbroxey.github.io/blog/2023/04/09/lucy-fenwick.html
// https://math.stackexchange.com/questions/1378286/find-the-sum-of-all-primes-smaller-than-a-big-number

int main() {
    constexpr u64 ITERS = 2'000'000;
    const auto sieve = Sieve(ITERS);
    std::cout << std::accumulate(sieve.primes.begin(), sieve.primes.end(), 0LL) << std::endl;
}