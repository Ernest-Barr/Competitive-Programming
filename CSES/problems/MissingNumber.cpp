#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    i64 n, sum = 0;
    cin >> n;

    for (int i = 1; i < n; ++i) {
        int num;
        cin >> num;
        sum += num;
    }

    cout << (n * (n + 1) / 2) - sum << "\n";
}
