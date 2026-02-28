fun countPrimeSetBits(left: Int, right: Int): Int {
    var res = 0
    // 2,3,5,7,11,19
    val primes: Set<Int> = setOf(2, 3, 5, 7, 11, 13, 17, 19)

    fun countBits(num: Int): Int {
        var n = num
        var bits = 0

        while (n != 0) {
            if (n % 2 == 1) bits++
            n /= 2
        }

        return bits
    }

    for (num in left..right) if (countBits(num) in primes) res++

    return res
}