#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string str;
    cin >> str;

    const int n = str.length();
    string res(n, ' ');
    bool flag = false;

    vector<int> freq(26, 0);

    for (int i = 0; i < n; ++i) freq[str[i] - 'A']++;
    for (int i = 0, j = 0; i < 26; ++i) {
        while (freq[i] > 0) {
            if (freq[i] & 1 && n & 1 && !flag) {
                flag = true;
                res[n / 2] = 'A' + i;
                freq[i]--;
            } else if (!(freq[i] & 1)) {
                res[j] = 'A' + i;
                res[n - j - 1] = 'A' + i;
                freq[i] -= 2;
                j++;
            } else {
                cout << "NO SOLUTION" << "\n";
                return 0;
            }
        }
    }

    cout << res << "\n";
}
