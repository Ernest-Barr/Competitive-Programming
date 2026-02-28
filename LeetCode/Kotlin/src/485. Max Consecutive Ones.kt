private fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var res = 0
    var count = 0

    for (i in nums) {
        if (i == 1) {
            count++
            res = maxOf(res, count)
        } else {
            count = 0
        }
    }

    return res
}