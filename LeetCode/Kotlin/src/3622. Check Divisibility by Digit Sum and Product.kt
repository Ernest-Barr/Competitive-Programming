private fun checkDivisibility(n: Int): Boolean {
    var product = 1
    var sum = 0
    var num = n

    while (num != 0) {
        val d = num % 10

        sum += d
        product *= d

        num /= 10
    }

    return n % (sum + product) == 0
}
