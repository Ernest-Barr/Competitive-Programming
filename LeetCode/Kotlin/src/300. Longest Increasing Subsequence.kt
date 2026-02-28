fun lengthOfLIS(nums: IntArray): Int {
    val n = nums.size
    val dp: IntArray = IntArray(n) { 1 }
    var res = 1

    for (i in 0..<n) {
        for (j in 0..<i) {
            if (nums[j] < nums[i]) {
                dp[i] = maxOf(dp[i], 1 + dp[j])
            }
        }
        res = maxOf(res, dp[i])
    }

    return res
}