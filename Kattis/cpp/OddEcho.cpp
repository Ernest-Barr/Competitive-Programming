#include <bits/stdc++.h>

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    std::cin >> n;

    for (int i = 1; i <= n; ++i) {
        std::string s;
        std::cin >> s;

        if (i & 1) {
            std::cout << s << "\n";
        }
    }
}
