private fun sqrt(num: Int): Int {
    val epsilon: Double = 0.000001
    var x: Long = num.toLong()
    var y: Long = 1

    while (x - y > epsilon) {
        x = (x + y) / 2
        y = num / x
    }

    return x.toInt()
}