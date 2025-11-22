fun minimumOperations(nums: IntArray): Int {
    var res = 0

    for (num in nums) {
        val rem = num % 3
        res += minOf(rem, 3 - rem)
    }

    return res
}