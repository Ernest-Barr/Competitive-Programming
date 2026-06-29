import kotlin.math.abs

private fun sumOfGoodIntegers(n: Int, k: Int): Int {
    var res = 0
    val nums = maxOf(0, n - k)..(n + k)

    for (x in nums) if (abs(n - x) <= k && n and x == 0) res += x

    return res
}
