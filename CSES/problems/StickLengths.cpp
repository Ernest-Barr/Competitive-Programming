#include <bits/stdc++.h>

using i64 = long long;
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<i64> nums;
    nums.reserve(n);

    for (int i = 0; i < n; ++i) {
        int num;
        cin >> num;
        nums.emplace_back(num);
    }

    sort(nums.begin(), nums.end());

    const int med = nums[n / 2];
    i64 res = 0;

    for (int i = 0; i < n; ++i) {
        res += abs(nums[i] - med);
    }

    cout << res << "\n";
}
