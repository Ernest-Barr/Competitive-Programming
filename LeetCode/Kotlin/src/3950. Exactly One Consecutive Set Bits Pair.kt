private fun consecutiveSetBits(n: Int): Boolean {
    var count = 0
    var num = n
    var prev = 0

    while (num != 0 && count < 2) {
        val b = num and 1

        if (prev == 1 && b == 1) count++

        prev = b
        num = num shr 1
    }

    return count == 1
}
