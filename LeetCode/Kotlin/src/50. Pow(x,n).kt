import kotlin.math.pow

private fun myPow(x: Double, n: Int): Double {
    if (x == 0.0) return 0.0
    if (n == 0) return 1.0
    if (n == 1) return x

    var num: Double = if (n < 0) 1 / x else x
    var exp: Long = if (n < 0) -n.toLong() else n.toLong()
    var res: Double = 1.0

    while (exp > 0) {
        if (exp % 2 == 1L) {
            res *= num
            exp--
        } else {
            num *= num
            exp /= 2
        }
    }
    return res
}

fun main() {
    println(myPow(2.0, 10) == 2.0.pow(10))
    println(myPow(2.1, 3) == 2.1.pow(3))
    println(myPow(2.0, -2) == 2.0.pow(-2))
}