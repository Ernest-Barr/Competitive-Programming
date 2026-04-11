private fun minOperations(nums: IntArray): Int {
    /**
     Given a number n there should be a prime within range n < p < 2n

     WHen searching for a prime, we only have to iterate up to 2n

     When searching check if any number from n
     Search in range n to 2n and terminate immediately if non-prime is found
     **/

    fun isPrime(n: Int): Boolean {
        if (n < 2) return false

        var i = 2
        while (i * i <= n) {
            if (n % i++ == 0) return false
        }

        return true
    }

    // Possibly cache results if TLE or cache results of isPrime?
    fun getNextPrime(n: Int): Int {
        var i = n + 1

        while (true) {
            if (isPrime(i)) return i
            i++
        }

        return -1
    }

    fun getNextNonPrime(n: Int): Int {
        var i = n + 1

        if (isPrime(i)) return i + 1

        return i
    }

    var res = 0
    val primes: MutableSet<Int> = mutableSetOf()
    val nonprimes: MutableSet<Int> = mutableSetOf()
    for (i in nums.indices) {
        when (i % 2) {
            0 -> {
                if (nums[i] in primes || isPrime(nums[i])) {
                    primes.add(nums[i])
                    continue
                }

                val p = getNextPrime(nums[i])

                // println(p)

                nonprimes.add(nums[i])
                primes.add(p)

                res += p - nums[i]
            }

            1 -> {
                if (nums[i] in nonprimes || !isPrime(nums[i])) {
                    nonprimes.add(nums[i])
                    continue
                }

                val p = getNextNonPrime(nums[i])

                nonprimes.add(p)
                primes.add(nums[i])

                res += p - nums[i]
            }
        }
    }

    return res
}
