private fun smallestIndex(nums: IntArray): Int {

    for ((i, num) in nums.withIndex()) {
        var cpy = num
        var sum = 0

        while (cpy != 0) {
            sum += cpy % 10
            cpy /= 10
        }

        if (sum == i) return i
    }

    return -1
}
