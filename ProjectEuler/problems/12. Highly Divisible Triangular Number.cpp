#include "util.h"

int main() {
    //TODO: Optimize this....
    const auto prime_factors = [&](const u64 num) {
        u64 j = 1;
        vec<u64> factors;

        while (j * j <= num) {
            if (num % j == 0) factors.push_back(j);
            j++;
        }

        return factors;
    };

    const auto num_factors = [&](const vec<u64>& factors, const u64 num) {
        std::unordered_set<u64> res(factors.begin(), factors.end());

        for (u64 i = 0; i < factors.size(); ++i) {
            for (u64 j = 0; j < factors.size(); ++j) {
                const u64 product = factors[i] * factors[j];
                if (num % product == 0) res.insert(factors[j] * factors[i]);
            }
        }

        return res.size();
    };

    u64 i = 1;

    while (true) {
        const u64 tri = i * (i + 1) / 2;

        if (num_factors(prime_factors(tri), tri) > 500) {
            std::cout << tri << std::endl;
            break;
        }

        i++;
    }
}