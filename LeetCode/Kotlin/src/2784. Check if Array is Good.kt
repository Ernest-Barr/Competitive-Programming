private fun isGood(nums: IntArray): Boolean {
    val n = nums.size - 1
    val map: MutableMap<Int, Int> = mutableMapOf()

    for (num in nums) {
        map[num] = if (num in map) map[num]!! + 1 else 1
        if (num !in 1..n || (num != n && map[num]!! > 1)) return false
    }

    return n in map && map[n]!! == 2
}
