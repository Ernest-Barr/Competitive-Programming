fun smallestRepunitDivByK(k: Int): Int {
    if (k % 2 != 1) return -1
    var res: Long = 1L
    val k64 = k.toLong()

    for (i in 1..k) {
        if (res % k64 == 0L) return i
        res = (res * 10L + 1L) % k64
    }

    return -1
}