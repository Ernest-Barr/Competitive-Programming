private fun kthFactor(n: Int, k: Int): Int {
    var m = k
    var i = 1

    while (i * i <= n) {
        if (n % i == 0 && --m == 0) return i
        i++
    }

    i = if ((i - 1) * (i - 1) == n) i - 2 else i - 1

    while (i > 0) {
        if (n % i == 0 && --m == 0) return n / i
        i--
    }


    return -1
}
