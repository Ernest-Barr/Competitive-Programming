// https://open.kattis.com/problems/oddecho

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    for (int i = 1; i <= n; ++i) {
        string s;
        cin >> s;

        if (i & 1) {
            cout << s << "\n";
        }
    }
}
