private fun maxAlternatingSum(nums: IntArray): Long {
    /**
    Two Pointers:
    Even index needs to contain the bigger square
    Odd index needs to contain the smalle square

    [14, 15, -10, -9, 4] -> [-10, -9, 4, 14, 15]

    225, 196, 100, 81, 16

    225 - 16 + 196 - 81 + 100 = 424
     */

    var res = 0L
    val n = nums.size
    var l = 0
    var r = n - 1
    var i = 0

    for (i in nums.indices) nums[i] = nums[i] * nums[i]
    nums.sort()

    while (l <= r) {
        res += when (i++ and 1) {
            0 -> nums[r--]
            else -> -nums[l++]
        }
    }

    return res
}
