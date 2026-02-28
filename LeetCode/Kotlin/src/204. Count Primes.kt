private fun countPrimes(n: Int): Int {
    if (n == 1 || n == 0) return 0

    val primes: BooleanArray = BooleanArray(n + 1) { true }
    primes[0] = false
    primes[1] = false

    var res = 0

    for (i in 2..n) {
        if (primes[i]) {
            for (j in (i * 2)..n step i) {
                primes[j] = false
            }
        }
    }

    for (prime in primes.indices) if (prime < n && primes[prime]) res++

    return res
}