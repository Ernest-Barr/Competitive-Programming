#include "util/solution.h"

int findMaxConsecutiveOnes(vector<int>& nums) {
    int res = 0;
    int count = 0;

    for (auto num : nums) {
        if (num == 1) {
            count++;
            res = max(res, count);
        } else {
            count = 0;
        }
    }

    return res;
}
