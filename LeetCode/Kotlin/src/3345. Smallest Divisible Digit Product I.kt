private fun smallestNumber(n: Int, t: Int): Int {

    for (num in n..(n+t)) {
        var product = 1
        var cpy = num

        while (cpy != 0) {
            product *= cpy % 10
            cpy /= 10
        }

        if (product % t == 0) return num
    }

    return -1
}
