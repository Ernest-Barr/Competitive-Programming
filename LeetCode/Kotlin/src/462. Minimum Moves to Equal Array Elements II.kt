import kotlin.math.abs

private fun minMoves2(nums: IntArray): Int {
    nums.sort()
    val n = nums.size
    val med = nums[n / 2]

    var res = 0

    // println(med)
    // println(nums.joinToString(","))

    for (num in nums) res += abs(num - med)

    return res
}
