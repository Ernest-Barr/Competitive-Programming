#include <iostream>

int main() {
    long long  n = 0;

    std::cin >> n;

    long long  res = n > 0 ?  n * (n + 1) /  2 : (n * ( n - 1) / -2 ) + 1;

    std::cout << res;
}