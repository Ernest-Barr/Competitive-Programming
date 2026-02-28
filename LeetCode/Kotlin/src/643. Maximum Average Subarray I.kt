private fun findMaxAverage(nums: IntArray, k: Int): Double {
    var sum = 0

    for (i in 0..<k) {
        sum += nums[i]
    }

    var res = sum.toDouble() / k.toDouble()

    for (i in k..<nums.size) {
        sum += nums[i] - nums[i - k]
        res = maxOf(res, sum.toDouble() / k.toDouble())
    }

    return res
}