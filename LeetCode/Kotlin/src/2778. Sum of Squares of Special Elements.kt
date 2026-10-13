private fun sumOfSquares(nums: IntArray): Int {
    var res = 0
    val n = nums.size

    for (i in nums.indices) {
        if (n % (i + 1) == 0) {
            res += nums[i] * nums[i]
        }
    }

    return res
}
