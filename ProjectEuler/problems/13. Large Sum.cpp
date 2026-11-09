#include "util.h"

int main() {
    vec<str> nums;
    std::ifstream file("../problem_data/LargeSumNumbers");

    str line;
    u64 res = 0;

    while (getline(file, line)) nums.push_back(line);

    /*
     * Similar in concept to
     * https://leetcode.com/problems/add-two-numbers/description/
     *
     * 
     * Contribution to leftmost digits decreases the further right you go, only sum the 10 + a few extra to get an approximation
     *
     */
    for (auto num : nums) res += std::stoll(num.substr(0, 15));

    std::cout << std::to_string(res).substr(0, 10) << std::endl;
}