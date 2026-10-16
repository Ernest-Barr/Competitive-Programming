private fun findMin(nums: IntArray): Int {
    val n = nums.size
    var l = 0
    var r = n -1

    while (l <= r ) {
        val m = l + (r - l) / 2

        when {
            nums[m] > nums[n - 1] -> l = m + 1
            else -> r = m - 1
        }
    }

    return nums[l]
}
