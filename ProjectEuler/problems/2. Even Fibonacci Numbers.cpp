#include "util.h"

int main() {
    constexpr i64 MAX = 4000000;
    i64 res = 0, a = 0, b = 1;

    while (b < MAX) {
        const i64 fib = a + b;

        if ((fib & 1) == 0) res += fib;

        a = b;
        b = fib;
    }

    std::cout << res << std::endl;
}
