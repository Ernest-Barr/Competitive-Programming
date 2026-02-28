fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var res = Int.MAX_VALUE
    var l = 0
    var sum = 0
    val n = nums.size

    for (r in nums.indices) {
        sum += nums[r]

        while (sum >= target && l <= r) {
            res = minOf(res, r - l + 1)
            // println("Min: $res , L: $l , R: $r")
            sum -= nums[l++]
        }
    }

    return if (res != Int.MAX_VALUE) res else 0
}