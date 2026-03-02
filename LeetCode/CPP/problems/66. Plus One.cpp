#include "util/solution.h";

using namespace std;

vector<int> plusOne(vector<int>& digits) {
        const int n = digits.size();

        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        vector<int> res = vector(n + 1, 1);
        copy(digits.begin(), digits.end(), res.begin() + 1);

        return res;
    }