private fun missingNumber(nums: IntArray): Int {
    val n = nums.size
    val expected = n * (n + 1) / 2
    var sum = 0
    nums.forEach {sum += it}
    return expected - sum
}