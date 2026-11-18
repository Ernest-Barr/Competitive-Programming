#include <bits/stdc++.h>

using namespace std;
using u64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    u64 prev, res = 0;
    cin >> prev;

    while (--n) {
        u64 num;
        cin >> num;

        if (prev > num) {
            u64 delta = prev - num;
            res += delta;
            prev = num + delta;
        } else {
            prev = num;
        }
    }

    cout << res << "\n";
}
