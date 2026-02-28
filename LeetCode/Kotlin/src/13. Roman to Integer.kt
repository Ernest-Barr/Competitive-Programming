fun romanToInt(s: String): Int {
    fun vals(ch: Char): Int {
        return when (ch) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }

    var sum: Int = 0

    for (i in 0 until s.length - 1) {
        if (vals(s[i]) < vals(s[i + 1])) {
            sum -= vals(s[i])
        } else {
            sum += vals(s[i])
        }
    }

    sum += vals(s[s.length - 1])
    return sum
}