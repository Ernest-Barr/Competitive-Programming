#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    i64 n;
    cin >> n;

    const i64 sum = n * (n + 1) / 2;

    if (sum & 1) {
        cout << "NO" << "\n";
    } else {
        cout << "YES" << "\n";

        vector<int> set1, set2;

        const i64 target = sum / 2; 
        i64 curr = 0; 
        
        for (int i = n; i >= 1; --i) {
            if (curr + i <= target) {
                set1.push_back(i);
                curr += i;
            } else {
                set2.push_back(i);
            }
        }

        cout << set1.size() << "\n";
        for (int i = 0; i < set1.size(); ++i) cout << set1[i] << " ";
        cout << "\n" << set2.size() << "\n";
        for (int i = 0; i < set2.size(); ++i) cout << set2[i] << " ";
    }
}
