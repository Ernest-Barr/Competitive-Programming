#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    i64 res = 0, n, x;
    cin >> n >> x;

    vector<int> nums;
    nums.reserve(n);

    for (int i = 0; i < n; ++i) {
        int num;
        cin >> num;
        nums.emplace_back(num);
    }

    int l = 0;
    int sum = 0;

    for (int r = 0; r < n; ++r) {
        sum += nums[r];

        while (l < r && sum > x) {
            sum -= nums[l++];
        }

        if (sum == x) res++;
    }

    cout << res << "\n";
}
