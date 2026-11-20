#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    i64 prev, res = 0;
    cin >> prev;

    while (--n) {
        i64 num;
        cin >> num;

        if (prev > num) {
            i64 delta = prev - num;
            res += delta;
            prev = num + delta;
        } else {
            prev = num;
        }
    }

    cout << res << "\n";
}
