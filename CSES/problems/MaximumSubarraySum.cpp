#include <bits/stdc++.h>

using i64 = long long;
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    i64 res = LONG_LONG_MIN, curr = 0;

    vector<i64> nums;
    nums.reserve(n);

    for (int i = 0; i < n; ++i) {
        int num;
        cin >> num;
        nums.emplace_back(num);
    }

    for (int i = 0; i < n; ++i) {
        curr = max(nums[i], curr + nums[i]);
        res = max(res, curr);
    }

    cout << res << "\n";
}
