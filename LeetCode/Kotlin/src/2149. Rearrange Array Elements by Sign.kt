private fun rearrangeArray(nums: IntArray): IntArray {
    val n = nums.size
    val res: IntArray = IntArray(n) { 0 }
    var pos = 0
    var neg = 1

    for (num in nums) {
        when {
            num >= 0 -> {
                res[pos] = num
                pos += 2
            }

            else -> {
                res[neg] = num
                neg += 2
            }
        }
    }

    return res
}
