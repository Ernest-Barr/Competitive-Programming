private fun calculateScore(c: Int, d: Int): Int {
    var a = c
    var b = d
    var s1 = 0
    var s2 = 0

    repeat(32) {
        if (a and 1 == 1) s1++
        if (b and 1 == 1) s2++

        b = b shr 1
        a = a shr 1
    }

    return if (s1 >= s2) s1 * s2 else s2 / s1
}
