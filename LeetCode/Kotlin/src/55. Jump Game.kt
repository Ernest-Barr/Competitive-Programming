private fun canJump(nums: IntArray): Boolean {
    var max = 0
    val n = nums.size

    for (i in nums.indices) {
        if (max == n - 1) return true
        if (nums[i] == 0 && i == max) return false

        max = maxOf(max, i + nums[i])
    }

    return max >= n - 1
}
