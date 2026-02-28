private fun maxFrequencyElements(nums: IntArray): Int {
    val map: MutableMap<Int, Int> = mutableMapOf()
    var maxFreq = 0
    var res = 0

    for (num in nums) {
        map[num] = if (num in map) map[num]!! + 1 else 1
        maxFreq = maxOf(maxFreq, map[num]!!)
    }

    for (f in map.values) if (f == maxFreq) res += f
    return res
}