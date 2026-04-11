private fun countDigitOccurrences(
    nums: IntArray,
    digit: Int,
): Int {
    var res = 0

    for (num in nums) {
        var cpy = num

        while (cpy > 0) {
            if (cpy % 10 == digit) res++

            cpy /= 10
        }
    }

    return res
}
