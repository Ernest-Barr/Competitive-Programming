import kotlin.math.abs

private fun maxAdjacentDistance(nums: IntArray): Int {

    var res = Int.MIN_VALUE

    for (i in 1..<nums.size) res = maxOf(res, abs(nums[i] - nums[i - 1]))
    res = maxOf(res, abs(nums[0] - nums[nums.size - 1]))

    return res
}

fun main() {
    println(maxAdjacentDistance(intArrayOf(1, 2, 4)) == 3)
    println(maxAdjacentDistance(intArrayOf(-5, -10, -5)) == 5)
    println(maxAdjacentDistance(intArrayOf(0, 0)) == 0)
    println(maxAdjacentDistance(intArrayOf(1, 2, 3, 4, 5)) == 4)
    println(maxAdjacentDistance(intArrayOf(5, 4, 3, 2, 1)) == 4)
    println(maxAdjacentDistance(intArrayOf(-1, 2, -3, 4, -5, 6)) == 11)
    println(maxAdjacentDistance(intArrayOf(1, -2, 3, -4, 5, -6)) == 11)
}