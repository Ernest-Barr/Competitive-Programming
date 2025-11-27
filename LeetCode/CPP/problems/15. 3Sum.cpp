#include "util/solution.h"

vector<vector<int>> threeSum(vector<int>& nums) {
    sort(nums.begin(), nums.end());
    set<vector<int>> res;

    for (int i = 0; i < nums.size() - 2; ++i) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        int l = i + 1;
        int r = nums.size() - 1;

        while (l < r) {
            const int sum = nums[i] + nums[l] + nums[r];

            if (sum == 0) {
                res.insert({nums[i], nums[l], nums[r]});
                l++;
                r--;
            } else if (sum > 0) {
                r--;
            } else {
                l++;
            }
        }
    }

    return vector(res.begin(), res.end());
}
