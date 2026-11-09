private fun minMergedInteger(nums: IntArray): Int {
    val n = nums.size
    var res = Int.MAX_VALUE

    for (i in 1..<n step 2) res = minOf(res, ("" + nums[i - 1] + nums[i]).toInt())

    return res
}
