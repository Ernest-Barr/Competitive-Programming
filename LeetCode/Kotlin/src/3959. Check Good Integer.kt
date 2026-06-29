private fun checkGoodInteger(n: Int): Boolean {
    var num = n

    var square = 0
    var sum = 0

    while (num != 0) {
        val d = num % 10
        sum += d
        square += d * d

        num /= 10
    }

    return square - sum >= 50
}
