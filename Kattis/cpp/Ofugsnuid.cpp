// https://open.kattis.com/problems/ofugsnuid

#include <bits/stdc++.h>

int main () {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    std::cin >> n;
    std::vector<int> nums(n);

    for (int i = 0; i < n; ++i) {
        std::cin >> nums[i];
    }

    for (const int & num : std::views::reverse(nums)) {
        std::cout << num << "\n";
    }
}
