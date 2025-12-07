private fun rob(nums: IntArray): Int {
    val n = nums.size
    if (n == 1) return nums[0]
    val dp: IntArray = IntArray(n) { Int.MIN_VALUE }

    dp[0] = nums[0]
    // Need to make decision on the second value as well
    dp[1] = maxOf(nums[0], nums[1])

    for (i in 2..<n) {
        dp[i] = maxOf(dp[i - 1], dp[i - 2] + nums[i])
    }

    return maxOf(dp[n - 1], dp[n - 2])
}