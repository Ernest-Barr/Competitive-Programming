private fun maxPairStrength(nums: IntArray): Long {
    var res = 0L
    val n = nums.size

    fun gcd(a: Int, b: Int): Long = if (b == 0) a.toLong() else gcd(b, a % b)

    for (i in 0..<n) {
        for (j in i..<n) {
            val gcd = gcd(nums[i], nums[j])
            res = maxOf(res, (nums[i].toLong() * nums[j]) / (gcd * gcd))
        }
    }

    return res
}
