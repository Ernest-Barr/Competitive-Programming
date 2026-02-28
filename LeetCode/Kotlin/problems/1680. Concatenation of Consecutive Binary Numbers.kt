fun concatenatedBinary(n: Int): Int {
    val mod = 1_000_000_007
    var res = 0L

    for (i in 1..n) {
        var num = i
        var j = 0

        while (num != 0) {
            num = num shr 1
            j++
        }

        res = ((res shl j) + i) % mod

    }

    return res.toInt()
}