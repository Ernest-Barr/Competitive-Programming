private fun twoSum(nums: IntArray, target: Int): IntArray {
    val map: MutableMap<Int, Int> = mutableMapOf()
    for (i in nums.indices) {
        val num = nums[i]
        if ((target - num) in map) return intArrayOf(map[target - num]!!, i)
        map[num] = i
    }
    return intArrayOf()
}