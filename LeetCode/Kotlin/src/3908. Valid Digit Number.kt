import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

fun validDigit(
    n: Int,
    x: Int,
): Boolean {
    // num / floor(Log10(n))
    var num = n

    if ((num / 10.0.pow(floor(log10(n.toDouble())))).toInt() == x) return false

    while (num > 0) {
        if (num % 10 == x) return true

        num /= 10
    }

    return false
}
