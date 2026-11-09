private fun minMoves(nums: IntArray): Int {
    var res = 0
    nums.sort()

    // println(nums.joinToString(","))
    for (num in nums) res += num - nums[0]

    return res
}
