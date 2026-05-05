private fun sumOfPrimesInRange(n: Int): Int {
    fun reverse(num: Int): Int {
        var res = 0
        var cpy = num

        while (cpy > 0) {
            res *= 10
            res += cpy % 10

            cpy /= 10
        }

        return res
    }

    fun isPrime(num: Int): Boolean {
        if (num < 2) return false

        var i = 2

        while (i * i <= num) {
            if (num % i++ == 0) return false
        }

        return true
    }

    val r = reverse(n)
    var res = 0
    for (i in minOf(n, r)..maxOf(n, r)) if (isPrime(i)) res += i

    return res
}
