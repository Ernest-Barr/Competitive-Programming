private fun missingInteger(nums: IntArray): Int {
    var curr = nums[0]
    val n = nums.size

    for (i in 1..<n) {
        if (nums[i] == nums[i - 1] + 1) curr += nums[i] else break
    }

    while (curr in nums) curr++

    return curr
}
