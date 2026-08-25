private fun lateFee(daysLate: IntArray): Int {
    var res = 0

    for (day in daysLate) {
        res += when (day) {
            1 ->  1
            in 2..5 -> 2 * day
            else -> 3 * day
        }
    }

    return res
}
