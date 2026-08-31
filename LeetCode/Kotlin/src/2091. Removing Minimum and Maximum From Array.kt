private fun minimumDeletions(nums: IntArray): Int {
    val n = nums.size
    var maxI = 0
    var minI = 0

    for (i in nums.indices) {
        if (nums[i] > nums[maxI]) maxI = i
        if (nums[i] < nums[minI]) minI = i
    }

    return minOf(maxOf(maxI, minI) + 1, n - minOf(maxI, minI), minOf(maxI, minI) + (n - maxOf(minI, maxI)) + 1)
}
