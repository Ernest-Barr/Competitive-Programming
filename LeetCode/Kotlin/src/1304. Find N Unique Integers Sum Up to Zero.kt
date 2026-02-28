private fun sumZero(n: Int): IntArray {
    val res: IntArray = IntArray(n) { 0 }
    // if (n % 2 != 0) res[0] = 0
    var num = 1
    for (i in 0..<(n / 2)) {
        res[i] = -num
        res[n - i - 1] = num
        num++
    }

    return res
}