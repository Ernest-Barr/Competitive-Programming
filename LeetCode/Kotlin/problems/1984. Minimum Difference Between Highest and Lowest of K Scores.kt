fun minimumDifference(nums: IntArray, k: Int): Int {
    nums.sort()
    val n = nums.size
    var res = Int.MAX_VALUE

    for (i in 0..n - k) {
        res = minOf(res, nums[i + k - 1] - nums[i])
    }

    return res
}