fun constructTransformedArray(nums: IntArray): IntArray {
    val n = nums.size
    val res = IntArray(n) { Int.MAX_VALUE }

    for (i in nums.indices) {
        res[i] = nums[(i + nums[i]).mod(nums.size)]
    }

    return res
}