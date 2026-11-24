private fun countDominantElements(nums: IntArray): Int {
    val n = nums.size
    var res = 0

    for (i in 0..<n) {
        val prev = if (i - 1 >= 0) nums[i - 1] else 0
        val next = if (i + 1 < n) nums[i + 1] else 0
        val avg = (next + prev) / if (next == 0 && prev == 0) -1.0 else if (prev == 0 || next == 0) 1.0 else 2.0
        if (nums[i].toDouble() >= avg) res++
    }

    return res
}
