private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var c = 0
    var res = 0

    var l = 0

    for (r in nums.indices) {
        if (nums[r] == 0) c++

        while (l < r && c > 1) {
            if (nums[l++] == 0) c--
        }

        res = maxOf(res, r - l + 1)
    }

    return res
}
