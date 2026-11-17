private fun partitionArray(nums: IntArray, k: Int): Int {
    nums.sort()

    val n = nums.size
    var l = 0
    var res = 1

    for (r in 1..<n) {
        if (nums[r] - nums[l] > k) {
            l = r
            res++
        }
    }


    return res
}
