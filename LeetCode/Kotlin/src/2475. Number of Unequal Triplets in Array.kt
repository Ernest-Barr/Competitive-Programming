private fun unequalTriplets(nums: IntArray): Int {
    val n = nums.size
    var res = 0

    for (i in 0..<n) {
        for (j in i + 1..<n) {
            for (k in j + 1..<n) {
                if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                    res++
                }
            }
        }
    }

    return res
}
