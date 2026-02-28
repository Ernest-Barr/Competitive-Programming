private fun minimumCost(nums: IntArray): Int {
    var first = Int.MAX_VALUE
    var second = Int.MAX_VALUE
    val n = nums.size

    for (i in 1..<n) {
        if (nums[i] < first) {
            second = first
            first = nums[i]
        } else if (nums[i] < second) {
            second = nums[i]
        }
    }

    return nums[0] + first + second
}