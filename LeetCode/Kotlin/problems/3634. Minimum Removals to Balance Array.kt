private fun minRemoval(nums: IntArray, k: Int): Int {
    nums.sort()

    val n = nums.size
    var res = n
    var r = 0

    for (l in nums.indices) {
        val mult: Long = k.toLong() * nums[l]
        while (r < n && nums[r++] <= mult)
            res = minOf(res, n - (r - l))
    }

    return res

}