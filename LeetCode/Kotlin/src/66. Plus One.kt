private fun plusOne(digits: IntArray): IntArray {

    for (i in digits.indices.reversed()) {
        if (digits[i] + 1 != 10) {
            digits[i]++
            return digits
        }

        digits[i] = 0
    }

    val cpy = digits.copyOf(digits.size + 1)
    cpy[0] = 1

    return cpy
}