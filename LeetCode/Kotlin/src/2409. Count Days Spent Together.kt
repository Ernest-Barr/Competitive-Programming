private fun countDaysTogether(arriveAlice: String, leaveAlice: String, arriveBob: String, leaveBob: String): Int {
    val months: IntArray = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val pref: IntArray = IntArray(13) { 0 }

    for (i in 1..12) pref[i] = pref[i - 1] + months[i - 1]

    fun String.toDay(): Int {
        val (months, days) = this.split("-")
        return pref[months.toInt() - 1] + days.toInt()
    }

    return maxOf(0, minOf(leaveAlice.toDay(), leaveBob.toDay()) - maxOf(arriveBob.toDay(), arriveAlice.toDay()) + 1)
}
