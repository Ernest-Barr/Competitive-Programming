private fun minimumSwaps(nums: IntArray): Int {
    var zeroes = 0
    var res = 0
    val n = nums.size

    for (num in nums) if (num == 0) zeroes++

    for (i in n - 1 downTo n - zeroes) if (nums[i] != 0) res++

    return res
}
