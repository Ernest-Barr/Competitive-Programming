private fun maxProduct(nums: IntArray): Int {
    var res = Int.MIN_VALUE
    var min = 1
    var max = 1

    for (num in nums) {
        val temp = max
        max = maxOf(num, min * num, temp * num)
        min = minOf(num, min * num, temp * num)
        res = maxOf(res, min, max)
    }

    return res
}