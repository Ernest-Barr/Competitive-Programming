private fun alternatingSum(nums: IntArray): Int {
    var sum = 0

    for (i in nums.indices) {
        sum += if (i % 2 == 0) nums[i] else -nums[i]
    }

    return sum
}
