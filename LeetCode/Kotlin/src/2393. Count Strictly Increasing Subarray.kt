private fun countSubarrays(nums: IntArray): Long {
    val n = nums.size
    var l = 0
    var res = 0L

    for (i in 0..<n) {
        if (i > 0 && nums[i] <= nums[i - 1]) {
            val size = 0L + (i - 1) - l + 1
            l = i
            res += size * (size + 1) / 2
        }
    }

    val s = 0L + (n - 1) - l + 1
    res += s * (s + 1) / 2

    return res
}
