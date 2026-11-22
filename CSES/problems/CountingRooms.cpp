#include <bits/stdc++.h>

using i64 = long long;
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, res = 0;
    cin >> n >> m;

    vector<string> grid;
    grid.reserve(n);

    for (int i = 0; i < n; ++i) {
        string s;
        cin >> s;
        grid.emplace_back(s);
    }

    vector<pair<int, int>> d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    stack<pair<int, int>> stack;

    const auto valid = [&](const int x, const int y) {
        return x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == '.';
    };

    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            if (grid[i][j] == '.') {
                stack.push({i, j});
                grid[i][j] = '#';

                while (!stack.empty()) {
                    const auto [ux, uy] = stack.top();
                    stack.pop();

                    for (const auto& [dx, dy] : d) {
                        const int vx = ux + dx, vy = uy + dy;

                        if (valid(vx, vy)) {
                            stack.push({vx, vy});
                            grid[vx][vy] = '#';
                        }
                    }
                }

                res++;
            }
        }
    }

    cout << res << "\n";
}
