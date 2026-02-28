fun numSub(s: String): Int {
    // Number of substrings = (n * (n + 1) / 2)

    var res: Long = 0
    var count: Long = 0
    val mod: Int = (1e9 + 7).toInt()

    for (c in s) {
        when (c) {
            '1' -> count++
            '0' -> {
                res += (((count + 1) * count) / 2) % mod
                count = 0
            }
        }
    }

    return ((res + (count + 1) * count / 2) % mod).toInt()
}