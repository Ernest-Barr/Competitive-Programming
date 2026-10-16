private fun findMin(nums: IntArray): Int {
    val n = nums.size
    var r = n - 1
    var l = 0

    while (l <= r) {
        val m = l + (r - l) / 2

        when {
            nums[m] > nums[r] -> l = m + 1
            nums[m] < nums[r] -> r = m
            else -> r--
        }
    }

    return nums[l]
}
