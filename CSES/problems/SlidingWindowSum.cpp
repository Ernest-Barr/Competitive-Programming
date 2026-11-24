#include <bits/stdc++.h>

using i64 = long long;
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k, a, b, c;
    cin >> n >> k;

    vector<i64> nums(n, 0);

    cin >> nums[0] >> a >> b >> c;
    i64 sum = 0;

    for (int i = 1, j = 0; i < n; ++i) {
        nums[i] = (a * nums[i - 1] + b) % c;
        if (j++ < k) sum += nums[i - 1];
    }

    i64 res = n > 1 ? sum : nums[0];

    for (int i = k; i < n; ++i) {
        sum += nums[i] - nums[i - k];
        res ^= sum;
    }

    cout << res << "\n";
}
