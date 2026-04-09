fun xorAfterQueries(
    nums: IntArray,
    queries: Array<IntArray>,
): Int {
    var res = 0
    val n = nums.size
    val mod = (1e9 + 7).toInt()

    for ((l, r, k, v) in queries) {
        for (i in l..r step k) {
            nums[i] = ((1L * nums[i] * v) % mod).toInt()
        }
    }

    for (num in nums) {
        res = res xor num
    }

    return res
}
