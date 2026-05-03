#include "util/solution.h"

bool rotateString(string s, string goal) {
    return goal.length() == s.length() && (s + s).contains(goal);
}