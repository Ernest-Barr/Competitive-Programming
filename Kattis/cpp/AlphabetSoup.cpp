#include <bits/stdc++.h>

using namespace std;

int main() {
    vector<bool> chars(26, false);
    int curr = 0;
    char c;

    while (cin.get(c) && c != '\n') {
        if (!chars[c - 'A']) {
            chars[c - 'A'] = true;
            if (++curr == 26) {
                cout << "Alphabet Soup!" << "\n";
                return 0;
            }
        }
    }

    for (int i = 0; i < 26; ++i) {
        if (!chars[i]) cout << (char)('A' + i);
    }
}
