#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, x;
    cin >> n >> x;

    vector<pair<int, int>> nums;
    nums.reserve(n);
    for (int i = 0; i < n; ++i) {
        i64 num;
        cin >> num;
        nums.emplace_back(pair(num, i + 1));
    }

    sort(nums.begin(), nums.end());

    for (int i = 0; i < n; ++i) {
        int j = i + 1;
        int k = n - 1;

        while (j < k) {
            const i64 sum = nums[i].first + nums[j].first + nums[k].first;

            if (sum == x) {
                cout << nums[i].second << " " << nums[j].second << " " << nums[k].second << "\n";
                return 0;
            } else if (sum < x) {
                j++;
            } else {
                k--;
            }
        }
    }

    cout << "IMPOSSIBLE" << "\n";
}
