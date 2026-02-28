fun sumAndMultiply(n: Int): Long {
    if (n == 0) return 0L
    var digits: String = ""
    var sum = 0L

    var num = n

    while (num != 0) {
        val digit = num % 10

        if (digit != 0) {
            digits += digit
            sum += digit
        }

        num /= 10
    }


    return sum * digits.reversed().toLong()
}