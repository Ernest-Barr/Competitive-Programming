#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

constexpr i64 MOD = 1e9 + 7;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    i64 n, x = 2, res = 1;
    cin >> n;

    while (n > 0) {
        if (n & 1) {
            res = res * x % MOD;
        }

        x = x * x % MOD;
        n /= 2;
    }

    cout << res << "\n";
}
