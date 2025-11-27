#include "util/solution.h"

bool isAnagram(string s, string t) {
    vector<int> freq(26);

    for (const auto& c : s) {
        freq[c - 'a']++;
    }

    for (const auto& c : t) {
        freq[c - 'a']--;
    }

    for (const auto& num : freq)
        if (num != 0) return false;

    return true;
}
