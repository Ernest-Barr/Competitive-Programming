import kotlin.math.log10

private fun isArmstrong(n: Int): Boolean {
    var num = n
    var sum = 0
    val k = log10(n.toDouble()).toInt() + 1

    while (num != 0) {
        val d = num % 10
        var pow = 1

        repeat(k) {
            pow *= d
        }

        sum += pow
        num /= 10
    }

    return sum == n
}
