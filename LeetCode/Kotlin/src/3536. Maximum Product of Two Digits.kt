private fun maxProduct(n: Int): Int {
    val digits: MutableList<Int> = mutableListOf()
    var num = n

    while (num != 0) {
        digits.add(num % 10)
        num /= 10
    }

    digits.sort()

    return digits[digits.size - 1] * digits[digits.size - 2]
}
