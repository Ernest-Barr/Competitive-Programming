private fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val res: MutableList<IntArray> = mutableListOf()
    val n = intervals.size

    intervals.sortWith(compareBy { it[0] })
    res.add(intArrayOf(intervals[0][0], intervals[0][1]))

    for (i in 1..<n) {
        val (s, e) = res.last()

        when {
            e >= intervals[i][0] && e <= intervals[i][1] -> res.last()[1] = intervals[i][1]
            e > intervals[i][1] -> continue
            else -> res.add(intervals[i])
        }
    }

    return res.toTypedArray()
}
