#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s;
    cin >> s;

    int res = 0, curr = 0;
    char ch = s[0];

    for (int i = 0; i < s.length(); ++i) {
        if (s[i] == ch) {
            curr++;
            res = max(res, curr);
        } else {
            curr = 1;
            ch = s[i];
        }
    }

    cout << res << "\n";
}
