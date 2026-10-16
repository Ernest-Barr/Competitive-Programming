private fun maxPrimes(n: Int, s: Int): List<Int> {
    //Sieve of Eratosthenes
    val isPrime = BooleanArray(n + 1) { true }
    val res: MutableList<Int> = mutableListOf()
    var p = 2
    var sum = 0

    isPrime[0] = false
    isPrime[1] = false

    while (p * p <= n) {
        if (isPrime[p]) {
            var i = p * p

            while (i <= n) {
                isPrime[i] = false
                i += p
            }
        }

        p++
    }

    for (i in isPrime.indices) {
        if (isPrime[i]) {
            if (sum + i > s) break
            res.add(i)
            sum += i
        }
    }

    return res
}
