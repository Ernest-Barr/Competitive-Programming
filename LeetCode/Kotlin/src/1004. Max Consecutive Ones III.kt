private fun longestOnes(nums: IntArray, k: Int): Int {
    var l = 0
    var res = 0
    var kCount = 0

    for (r in nums.indices) {
        if (nums[r] == 0) kCount++

        while (kCount > k) {
            if (nums[l] == 0) kCount--
            l++
        }

        res = maxOf(res, r - l + 1)
    }

    return res
}