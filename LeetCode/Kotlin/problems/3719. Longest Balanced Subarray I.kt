private fun longestBalanced(nums: IntArray): Int {
    val n = nums.size
    var res = 0

    for (i in 0..<n) {
        var even = 0
        var odd = 0
        val set: MutableSet<Int> = mutableSetOf()

        for (j in i..<n) {
            if (nums[j] !in set) if (nums[j] % 2 == 0) even++ else odd++
            set.add(nums[j])
            if (even == odd) res = maxOf(res, j - i + 1)
        }
    }

    return res
}