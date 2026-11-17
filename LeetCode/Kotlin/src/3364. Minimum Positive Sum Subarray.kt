private fun minimumSumSubarray(nums: List<Int>, l: Int, r: Int): Int {
    val n = nums.size
    var res = Int.MAX_VALUE

    for (i in 0..<n) {
        var sum = 0
        for (j in i..<n) {
            sum += nums[j]

            if (j - i + 1 in l..r && sum > 0) res = minOf(res, sum)
        }
    }


    return if (res == Int.MAX_VALUE) -1 else res
}
