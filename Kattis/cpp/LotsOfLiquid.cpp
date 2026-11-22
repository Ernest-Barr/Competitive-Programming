// https://open.kattis.com/problems/lotsofliquid

#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    double res = 0.0;

    while (n--) {
        double num;
        cin >> num;
        res += num * num * num;
    }
    // << setprecision(6)
    cout << fixed << setprecision(10) << cbrt(res) << "\n";
}
