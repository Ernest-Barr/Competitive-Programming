private fun numIdenticalPairs(nums: IntArray): Int {
    val map: MutableMap<Int, Int> = mutableMapOf()
    var res = 0

    for (num in nums) {
        res += map[num] ?: 0
        map[num] = (map[num] ?: 0) + 1
    }

    return res
}
