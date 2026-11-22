#include <bits/stdc++.h>

using namespace std;
using i64 = long long;
using point = struct {
    i64 x = 0;
    i64 y = 0;
};

int main() {
    int n;
    cin >> n;

    const auto sgn = [](i64 num) -> int { return (num > 0) - (num < 0); };
    const auto orientation = [&](point& a, point& b, point& c) -> int {
        return sgn((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)));
    };

    point p1, p2, p3;

    while (n--) {
        cin >> p1.x >> p1.y >> p2.x >> p2.y >> p3.x >> p3.y;

        const int o = orientation(p1, p2, p3);
        cout << (o == 1 ? "LEFT" : o == -1 ? "RIGHT" : "TOUCH") << "\n";
    }
}
