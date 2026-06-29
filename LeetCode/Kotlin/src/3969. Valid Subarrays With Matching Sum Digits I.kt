private fun countValidSubarrays(nums: IntArray, x: Int): Int {
    val n = nums.size
    var res = 0
    val xl = x.toLong()

    fun valid(num: Long): Boolean {

        val a = num % 10
        var b = num % 10
        var cpy = num

        while (cpy > 0) {
            b = cpy % 10
            cpy /= 10
        }

        return a == b && b == xl
    }


    for (i in 0..<n) {
        var sum: Long = 0L
        for (j in i..<n) {
            sum += nums[j]

            if (valid(sum)) res++
        }
    }

    return res
}
