private fun rob(nums: IntArray): Int {
    val n = nums.size

    fun helper(low: Int, high: Int): Int {
        val m = high - low + 1
        val dp: IntArray = IntArray(m) { Int.MIN_VALUE }
        dp[0] = nums[low]
        dp[1] = maxOf(nums[low], nums[low + 1])

        for (i in 2..<m) dp[i] = maxOf(nums[low + i] + dp[i - 2],  dp[i - 1])

        return dp[m - 1]
    }

    return when (n) {
        1 -> nums[0]
        2 -> maxOf(nums[0], nums[1])
        else -> maxOf(helper(0, n - 2), helper(1, n - 1))
    }
}