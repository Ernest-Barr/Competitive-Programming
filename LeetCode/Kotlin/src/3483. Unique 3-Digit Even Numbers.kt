private fun totalNumbers(digits: IntArray): Int {
    val set: MutableSet<Int> = mutableSetOf()

    for ((i, a) in digits.withIndex()) {
        if (a == 0) continue
        for ((j, b) in digits.withIndex()) {
            if (i == j) continue
            for ((k, c) in digits.withIndex()) {
                if (i == k || j == k) continue
                if (c % 2 == 0) set.add(a * 100 + b * 10 + c)
            }
        }
    }

    return set.size
}
