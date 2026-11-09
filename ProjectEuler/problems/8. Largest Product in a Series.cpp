#include "util.h"

int main() {
    std::ifstream input("../problem_data/LargestProductInSeries");
    str number;
    input >> number;

    const u64 n = number.length();
    u64 res = 0;


    //TODO: Change to sliding window........ divide by zero is annoying
    for (u64 i = 13; i < n; ++i) {
        u64 product = 1;

        for (u64 j = i - 13; j < i; ++j) {
            product *= number[j] - '0';
        }

        res = std::max(res, product);
    }

    std::cout << res << std::endl;




    // Sliding window problem
}