import kotlin.math.ceil

//TODO: Review
fun minEatingSpeed(piles: IntArray, h: Int): Int {
    var res = Int.MAX_VALUE
    var l = 1
    var r = piles.max()

    while (l <= r) {
        val m = l + (r - l) / 2
        var c = 0L

        for (pile in piles) c += ceil(pile.toDouble() / m).toInt()

        when {
            c <= h -> {
                res = minOf(res, m)
                r = m - 1
            }

            else -> l = m + 1
        }
    }

    return res
}