#ifndef COMPETITIVE_PROGRAMMING_UTIL_H
#define COMPETITIVE_PROGRAMMING_UTIL_H

#include <bits/stdc++.h>

using str = std::string;

using f64 = double;
using f32 = float;

using usize = std::size_t;
using u128 = __uint128_t;
using u64 = uint64_t;
using u32 = uint32_t;
using u16 = uint16_t;
using u8 = uint8_t;

using isize = std::ptrdiff_t;
using i128 = __int128;
using i64 = int64_t;
using i32 = int32_t;
using i16 = int16_t;
using i8 = int8_t;

template <typename T>
using vec = std::vector<T>;

struct Sieve {
    u64 n;

    vec<u64> primes;
    vec<bool> is_prime;

    explicit Sieve(const u64 n) : n(n) {
        is_prime.assign(n + 1, true);

        is_prime[0] = is_prime[1] = false;

        for (u64 p = 2; p * p <= n; ++p) {
            if (is_prime[p]) {
                for (u64 i = p * p; i <= n; i += p) {
                    is_prime[i] = false;
                }
            }
        }

        for (u64 p = 2; p <= n; ++p) {
            if (is_prime[p]) {
                primes.push_back(p);
            }
        }
    }
};





#endif  // COMPETITIVE_PROGRAMMING_UTIL_H
