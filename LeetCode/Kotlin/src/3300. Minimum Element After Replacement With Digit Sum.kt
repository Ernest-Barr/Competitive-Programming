fun minElement(nums: IntArray): Int {
    fun sum(num: Int): Int {
        var res = 0
        var cpy = num

        while (cpy != 0) {
            res += cpy % 10
            cpy /= 10
        }

        return res
    }

    var res = Int.MAX_VALUE

    for (num in nums) res = minOf(res, sum(num))

    return res
}
