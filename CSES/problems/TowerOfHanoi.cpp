#include <bits/stdc++.h>

using i64 = long long;
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<pair<int, int>> steps;

    const auto solve = [&](auto&& self, int disks, int from, int to,
                           int aux) -> i64 {
        i64 moves = 0;

        if (disks >= 1) {
            moves += self(self, disks - 1, from, aux, to);
            steps.push_back(pair(from, to));
            moves++;
            moves += self(self, disks - 1, aux, to, from);
        }

        return moves;
    };

    i64 res = solve(solve, n, 1, 3, 2);

    cout << res << "\n";

    for (const auto& move : steps)
        cout << move.first << " " << move.second << "\n";
}
