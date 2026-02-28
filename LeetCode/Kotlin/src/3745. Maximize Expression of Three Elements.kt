fun maximizeExpressionOfThree(nums: IntArray): Int {
    nums.sort()
    val n = nums.size
    return nums[n - 1] + nums[n - 2] - nums[0]
}
