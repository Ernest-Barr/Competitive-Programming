// https://open.kattis.com/problems/alphabetspam

#include <bits/stdc++.h>

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    std::string str;
    std::cin >> str;

    double whitespace = 0.0;
    double lowercase = 0.0;
    double uppercase = 0.0;
    double symbols = 0.0;

    for (int i = 0; i < str.length(); ++i) {
        if (str[i] >= 'a' && str[i] <= 'z') {
            lowercase++;
        } else if (str[i] >= 'A' && str[i] <= 'Z') {
            uppercase++;
        } else if (str[i] == '_') {
            whitespace++;
        } else {
            symbols++;
        }
    }
    
    std::cout << whitespace / str.length() << "\n" << lowercase / str.length() << "\n" << uppercase / str.length() << "\n" << symbols / str.length() << "\n";
}