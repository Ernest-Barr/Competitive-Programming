private fun minOperations(n: Int): Int {
    val nums = IntArray(n) { 2 * it + 1 }

    val med = nums.sum() / n
    var res = 0

    for (num in nums) {
        res += abs(num - med)
    }

    return res / 2
}
