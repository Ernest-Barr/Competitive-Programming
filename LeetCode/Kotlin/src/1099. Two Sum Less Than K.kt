fun twoSumLessThanK(nums: IntArray, k: Int): Int {
    nums.sort()

    var l = 0
    var r = nums.size - 1
    var res = -1

    while (l < r) {
        val sum = nums[l] + nums[r]
        when {
            sum < k -> {
                res = maxOf(res, sum)
                l++
            }
            else -> r--
        }
    }

    return res
}