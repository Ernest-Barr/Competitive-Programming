#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    set<int> nums;

    int n;
    cin >> n;

    int x;
    while (n--) {
        cin >> x;
        nums.insert(x);
    }

    cout << nums.size() << "\n";
}
