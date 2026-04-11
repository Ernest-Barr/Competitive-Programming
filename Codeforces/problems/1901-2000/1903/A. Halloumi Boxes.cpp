#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;


int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);

    int t = 0;
    cin >> t;

    for (int i = 0; i < t; ++i) {
        int n;
        int k;

        cin >> n >> k;

        vector<int> a(n);

        for (int j = 0; j < n; ++j) {
            cin >> a[j];
        }

        if (is_sorted(a.begin(), a.end())) {
            cout << "YES" << "\n";
        } else {
            cout << (k > 1 ? "YES" : "NO") << "\n";
        }
    }
}