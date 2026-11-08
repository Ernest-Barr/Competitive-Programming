// ICPC 2026 SE D2 Problem
// Translation of Python Solution to C++
#include <bits/stdc++.h>

int main() {
    int u = 0;

    std::cin >> u;

    const int n = std::sqrt(u) + 1;
    std::vector primes(n + 1, 0);
    std::iota(primes.begin(), primes.end(), 2);

    for (int p = 2; p * p <= n; ++p) {
        if (primes[p] == p) {
            for (int m = p; m <= n; m += p) {
                if (primes[m] == m) {
                    primes[m] = p;
                }
            }
        }
    }

    int res = 0;

    while (u != 1) {
        int attempt = u;

        for (const auto p : primes) {
            if (attempt % p == 0) {
                attempt = p;
                break;
            }
        }

        res += u / attempt;
        u /= attempt;
    }

    std::cout << res << std::endl;
}