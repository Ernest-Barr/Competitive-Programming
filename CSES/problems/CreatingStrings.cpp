#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string str;
    cin >> str;

    int n = str.length();
    vector<bool> used(n, false);
    vector<string> res;

    sort(str.begin(), str.end());

    const auto permute = [&](auto&& self, string& curr) {
        if (curr.length() == n) {
            res.push_back(curr);
            return;
        }

        for (int i = 0; i < n; ++i) {
            if (used[i] || (i > 0 && str[i] == str[i - 1] && !used[i - 1]))
                continue;

            curr.push_back(str[i]);
            used[i] = true;
            self(self, curr);
            curr.pop_back();
            used[i] = false;
        }
    };

    string curr;
    curr.reserve(n);
    permute(permute, curr);

    cout << res.size() << "\n";
    for (const auto& perm : res) cout << perm << "\n";
}
