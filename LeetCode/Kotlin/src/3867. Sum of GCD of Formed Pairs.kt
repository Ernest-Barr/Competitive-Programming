fun gcdSum(nums: IntArray): Long {
    fun gcd(
        a: Int,
        b: Int,
    ): Int {
        var num1 = a
        var num2 = b

        while (num2 != 0) {
            val t = num2
            num2 = num1 % num2
            num1 = t
        }

        return num1
    }

    val n = nums.size
    val mx = IntArray(n) { 0 }
    val prefixGcd = IntArray(n) { 0 }
    var res = 0L

    mx[0] = nums[0]
    // Build prefix mx
    for (i in 1..<n) {
        mx[i] = maxOf(mx[i - 1], nums[i])
    }

    // Build prefixGcd
    for (i in 0..<n) prefixGcd[i] = gcd(nums[i], mx[i])

    // Form pairs (Two Pointers):

    // println(mx.joinToString(","))
    // println(prefixGcd.joinToString(","))

    prefixGcd.sort()

    var l = 0
    var r = n - 1

    while (l < r) {
        res += gcd(prefixGcd[l++], prefixGcd[r--])
    }

    return res
}
