private fun longestSubarray(nums: IntArray): Int {
    val n = nums.size
    var res = 0
    var curr = 2

    for (i in 2..<n) {
        if (nums[i] == nums[i - 1] + nums[i - 2]) curr++ else curr = 2

        res = maxOf(res, curr)
    }

    return res
}
