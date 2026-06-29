private fun maxSum(nums: IntArray, k: Int, mul: Int): Long {
    nums.sort()

    val n = nums.size
    var i = 0
    var res = 0L
    var m: Long =  mul.toLong()

    while (i < k) {
        res += if (m > 0L) (nums[n - i - 1]).toLong() * m-- else nums[n - i - 1].toLong()
        i++
    }

    return res
}
