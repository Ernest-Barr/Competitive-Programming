import kotlin.math.abs

private fun absDifference(nums: IntArray, k: Int): Int {
    nums.sort()
    val n = nums.size
    var max = 0
    var min = 0

    for (i in n - 1 downTo n - k) max += nums[i]
    for (i in 0..<k) min += nums[i]

    return abs(max - min)
}