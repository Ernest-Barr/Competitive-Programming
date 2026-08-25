private fun largestInteger(nums: IntArray, k: Int): Int {
    val freq: MutableMap<Int, Int> = mutableMapOf()
    val n = nums.size
    var res = -1

    for (num in nums) freq[num] = if (num in freq) freq[num]!! + 1 else 1

    return when {
        k == n -> nums.max()

        k > 1 -> {
            val last = nums[n - 1]
            val first = nums[0]

            if (freq[first] == 1) res = maxOf(res, first)
            if (freq[last] == 1) res = maxOf(res, last)

            res
        }

        else -> {
            for (num in nums) if (freq[num] == 1) res = maxOf(res, num)

            res
        }
    }
}
