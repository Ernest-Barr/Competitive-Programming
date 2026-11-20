#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, x;
    cin >> n >> x;

    map<int, int> seen;

    for (int i = 0; i < n; ++i) {
        int num;
        cin >> num;

        if (seen.count(x - num)) {
            cout << seen[x - num] << " " << i + 1 << "\n";
            return 0;
        }

        seen[num] = i + 1;
    }

    cout << "IMPOSSIBLE" << "\n";
}
