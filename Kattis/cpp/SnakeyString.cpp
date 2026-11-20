// 2025 ICPC Problem
// https://open.kattis.com/problems/snakeystring

#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int r, c;
    cin >> r >> c;

    vector<string> grid;
    grid.reserve(r);

    for (int i = 0; i < r; ++i) {
        string s;
        cin >> s;
        grid.emplace_back(s);
    }

    string res;

    for (int i = 0; i < c; ++i) {
        for (int j = 0; j < r; ++j) {
            if (grid[j][i] >= 'A' && grid[j][i] <= 'Z') {
                res.push_back(grid[j][i]);
            }
        }
    }

    cout << res << "\n";
}
