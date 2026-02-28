private fun countElements(nums: IntArray, k: Int): Int {
    val n = nums.size
    if (k == 0) return n
    nums.sort()

    var res = 0

    val limit = nums[n - k]


    for (num in nums) {
        if (num < limit) res++
    }

    return res
}