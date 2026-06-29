import kotlin.math.abs

private fun leftRightDifference(nums: IntArray): IntArray {
    val n = nums.size
    val left = IntArray(n) { 0 }
    val right = IntArray(n) { 0 }
    val res = IntArray(n) { 0 }

    for (i in 1..<n) left[i] = left[i - 1] + nums[i - 1]
    for (i in n - 2 downTo 0) right[i] = right[i + 1] + nums[i + 1]
    for (i in 0..<n) res[i] = abs(left[i] - right[i])

    return res
}
