vector<int> maxPrimes(int n, int s) {
        vector<int> primes;
        vector<bool> is_prime(n + 1, true);

        is_prime[0] = is_prime[1] = false;

        for (int i = 2; i * i <= n; ++i) {
            if (is_prime[i]) {
                for (long long j = i * i; j <= n; j += i) {
                    is_prime[j] = false ;
                }
            }
        }

        vector<int> res;
        int sum = 0;

        for (int i = 0; i < n + 1; ++i) {
            if (is_prime[i]) {
                if (sum + i > s) break;
                res.push_back(i);
                sum += i;

            }
        }

        return res;
    }