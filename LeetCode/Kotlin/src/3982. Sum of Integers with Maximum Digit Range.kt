private fun maxDigitRange(nums: IntArray): Int {
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()

    fun getRange(num: Int): Int {
        var cpy = num

        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE


        while (cpy != 0) {
            val d = cpy % 10
            cpy /= 10
            min = minOf(min, d)
            max = maxOf(max, d)
        }

        return max - min
    }

    var max = 0

    for (num in nums) {
        val range = getRange(num)
        max = maxOf(max, range)

        if (range !in map) map[range] = mutableListOf()

        map[range]!!.add(num)
    }

    return map[max]!!.sum()
}
