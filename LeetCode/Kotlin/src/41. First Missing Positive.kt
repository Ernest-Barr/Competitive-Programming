private fun firstMissingPositiveBF(nums: IntArray): Int {
    // Brute Force
    //TODO: Optimize to reach space constraint
    val n = nums.size
    val arr = BooleanArray(n + 1) { false }

    for (num in nums) if (num in 1..n) arr[num] = true

    for (i in 1..n) if (!arr[i]) return i

    return n + 1
}
