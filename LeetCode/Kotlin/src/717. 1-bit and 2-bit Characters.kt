fun isOneBitCharacter(bits: IntArray): Boolean {
    var i = 0

    val n = bits.size

    while (i < n - 1) {
        when (bits[i]) {
            1 -> i += 2
            0 -> i += 1
        }
    }

    return i == n - 1
}