#include <bits/stdc++.h>

using namespace std;
using u64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    u64 n;
    cin >> n;

    u64 sum = 0;

    for (int i = 1; i < n; ++i) {
        int num;
        cin >> num;
        sum += num;
    }

    cout << (n * (n + 1) / 2) - sum << "\n";
}
