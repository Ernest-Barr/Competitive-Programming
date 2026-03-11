import kotlin.math.log2

fun bitwiseComplement(n: Int): Int =
    when (n) {
        0 -> {
            1
        }

        else -> {
            var res = n
            val len = log2(n.toDouble()).toInt()

            for (i in 0..len) res = res xor (1 shl i)

            res
        }
    }
