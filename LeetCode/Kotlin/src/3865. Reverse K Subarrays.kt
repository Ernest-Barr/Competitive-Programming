private fun reverseSubarrays(nums: IntArray, k: Int): IntArray {
    val n = nums.size
    val m = n / k

    for (i in m..n step m) {
        var l = i - m
        var r = i - 1

        while (l < r) {
            val t = nums[l]

            nums[l] = nums[r]
            nums[r] = t

            l++
            r--
        }
    }

    return nums
}
