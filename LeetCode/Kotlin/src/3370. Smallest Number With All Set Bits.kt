import kotlin.math.pow

fun smallestNumber(n: Int): Int {
    var res = 0.0
    var exp = 1

    while (res <= n) res = 2.0.pow(exp++)

    return (res - 1).toInt()
}