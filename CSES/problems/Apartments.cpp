#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, k, res = 0;
    cin >> n >> m >> k;

    vector<int> tenants, apartments;
    tenants.reserve(n);
    apartments.reserve(m);

    for (int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        tenants.emplace_back(x);
    }

    for (int i = 0; i < m; ++i) {
        int x;
        cin >> x;
        apartments.emplace_back(x);
    }

    sort(tenants.begin(), tenants.end());
    sort(apartments.begin(), apartments.end());

    int i = 0, j = 0;

    while (i < n && j < m) {
        if (abs(tenants[i] - apartments[j]) <= k) {
            i++;
            j++;
            res++;
        } else if (tenants[i] >= apartments[j] + k) {
            j++;
        } else {
            i++;
        }
    }

    cout << res << "\n";
}
