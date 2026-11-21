#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, x;
    cin >> n >> x;

    vector<pair<i64, int>> nums;
    nums.reserve(n);

    for (int i = 0; i < n; ++i) {
        int num;
        cin >> num;
        nums.emplace_back(pair(num, i + 1));
    }

    sort(nums.begin(), nums.end());

    for (int i = 0; i < n; ++i) {
        for (int j = i + 1; j < n; ++j) {
            int k = j + 1;
            int l = n - 1;

            while (k < l) {
                i64 sum = nums[i].first + nums[j].first + nums[k].first +
                          nums[l].first;

                if (sum == x) {
                    cout << nums[i].second << " " << nums[j].second << " "
                         << nums[k].second << " " << nums[l].second << "\n";

                    return 0;
                } else if (sum < x) {
                    k++;
                } else {
                    l--;
                }
            }
        }
    }

    cout << "IMPOSSIBLE" << "\n";
}
