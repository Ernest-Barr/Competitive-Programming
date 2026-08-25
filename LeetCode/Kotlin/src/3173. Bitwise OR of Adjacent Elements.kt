private fun orArray(nums: IntArray): IntArray {
    val n = nums.size
    val res: IntArray = IntArray(n - 1) { 0 }

    for (i in 0..<n - 1) {
        res[i] = nums[i] or nums[i + 1]
    }


    return res
}
