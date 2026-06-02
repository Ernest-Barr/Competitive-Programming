#include <cmath>
#include <iostream>

using namespace std;

int main() {
    long long int square = 0;
    long long int sum = 0;

    for (int i = 1; i <= 100; ++i) {
        square += i * i;
        sum += i;
    }

    sum *= sum;

    cout << abs(sum - square) << endl;
}