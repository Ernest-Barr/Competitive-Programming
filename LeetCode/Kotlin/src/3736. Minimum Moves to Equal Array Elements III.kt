import kotlin.math.abs

fun minMoves(nums: IntArray): Int {
    val max = nums.max()
    var res = 0

    for (num in nums) res += abs(num - max)

    return res
}