private fun longestSubarray(nums: IntArray): Int {
    var l = 0
    var count = 0
    var res = 0

    for (r in nums.indices) {
        if (nums[r] == 0) count++

        while (count > 1) {
            if (nums[l] == 0) count--
            l++
        }

        res = maxOf(res, r - l)
    }

    return res
}