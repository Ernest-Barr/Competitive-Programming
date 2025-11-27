#include "util/solution.h"

vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> map;

    for (int i = 0; i < nums.size(); ++i) {
        if (map.count(target - nums[i])) return {map.at(target - nums[i]), i};
        map[nums[i]] = i;
    }

    return {};
}
