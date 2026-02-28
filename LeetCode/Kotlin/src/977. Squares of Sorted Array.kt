import kotlin.math.abs

private fun sortedSquares(nums: IntArray): IntArray {
    val res: IntArray = IntArray(nums.size)

    var l = 0
    var r = nums.size - 1

    for (i in nums.size - 1 downTo 0) {
        if (abs(nums[l]) > abs(nums[r])) {
            res[i] = nums[l] * nums[l]
            l++
        } else {
            res[i] = nums[r] * nums[r]
            r--
        }
    }

    return res
}

fun main() {
    println(sortedSquares(intArrayOf(-7, -3, 2, 3, 11)).joinToString(", "))
    println(sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).joinToString(", "))
}