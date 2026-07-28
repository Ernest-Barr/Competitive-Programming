private fun findArray(pref: IntArray): IntArray {
    val n = pref.size
    val res: IntArray = IntArray(n) { 0 }
    res[0] = pref[0]

    for (i in 1..<n) {
        res[i] = pref[i] xor pref[i - 1]
    }

    return res
}
