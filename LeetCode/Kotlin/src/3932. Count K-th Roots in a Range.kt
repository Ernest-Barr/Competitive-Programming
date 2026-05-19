fun countKthRoots(l: Int, r: Int, k: Int): Int {
    fun binpow(a: Long, b: Long): Long {
        if (b == 0L) return 1L

        val num = binpow(a, b / 2L)

        return when (b % 2L) {
            0L -> num * num
            else -> num * num * a
        }
    }

    if (k == 1) return r - l + 1

    var base = 0L
    var res = 0
    val exp = k.toLong()

    while (true) {
        val num = binpow(base++, exp)

        if (num !in 0L..r) break
        if (num in l..r) res++
    }

    return res
}
