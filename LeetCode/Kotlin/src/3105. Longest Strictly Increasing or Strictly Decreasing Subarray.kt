private fun longestMonotonicSubarray(nums: IntArray): Int {
    var res = 0
    var inc = 0
    var dec = 0

    for (r in nums.indices) {
        when {
            r > 0 && nums[r] > nums[r - 1] -> {
                inc++
                dec = 1
            }

            r > 0 && nums[r] < nums[r - 1] -> {
                dec++
                inc = 1
            }

            else -> {
                dec = 1
                inc = 1
            }
        }

        res = maxOf(res, inc, dec)
    }

    return res
}
