#include <bits/stdc++.h>

using namespace std;
using i64 = long long;

const int M = 1e9 + 7;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    
    vector<int> nums;
    nums.reserve(n);

    while (n--) {
        i64 a, b, res = 1;
        cin >> a >> b;

        while (b > 0) {
            if (b & 1) res = res * a % M;
            a = a * a % M;
            b >>= 1;
        }

        nums.emplace_back(res);
    }

    for (int i = 0; i < nums.size(); ++i) 
        cout << nums[i] << "\n";
}
