private fun getConcatenation(nums: IntArray): IntArray {
    val res: IntArray = IntArray(nums.size * 2)

    for (i in nums.indices) {
        res[i] = nums[i]
        res[i + nums.size] = nums[i]
    }

    return res
}

fun main() {
    println(getConcatenation(intArrayOf(1, 2, 1)).contentEquals(intArrayOf(1, 2, 1, 1, 2, 1)))
    println(getConcatenation(intArrayOf(1, 3, 2, 1)).contentEquals(intArrayOf(1, 3, 2, 1, 1, 3, 2, 1)))
}