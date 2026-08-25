private fun runningSum(nums: IntArray): IntArray {
    val n = nums.size
    val res = IntArray(n) { nums[0] }

    for (i in 1..<n) res[i] = res[i - 1] + nums[i]

    return res
}
