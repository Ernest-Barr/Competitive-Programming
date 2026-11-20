#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<int> arr;
    arr.reserve(n);

    for (int i = 0; i < n; ++i) {
        int num;
        cin >> num;
        arr.emplace_back(num);
    }

    set<int> seen;
    int l = 0;
    i64 res = 0LL;

    for (int r = 0; r < n; ++r) {
        while (l < r && seen.count(arr[r])) {
            seen.erase(arr[l++]);
        }

        res += r - l + 1;
        seen.insert(arr[r]);
    }

    cout << res << "\n";
}
