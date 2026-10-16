#include <bits/stdc++.h>

using namespace std;

int main() {
    long long n = 0;

    cin >> n;

    const long long res = n > 0 ? n * (n + 1) / 2 : n * (n - 1) / -2 + 1;

    cout << res << endl;
}