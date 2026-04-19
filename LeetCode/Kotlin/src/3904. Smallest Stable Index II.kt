private fun firstStableIndex(
    nums: IntArray,
    k: Int,
): Int {
    val n = nums.size

    val pref: IntArray = IntArray(n) { 0 }
    val suf: IntArray = IntArray(n) { Int.MAX_VALUE }

    pref[0] = nums[0]
    suf[n - 1] = nums[n - 1]

    var res = Int.MAX_VALUE

    for (i in 1..<n) pref[i] = maxOf(pref[i - 1], nums[i])

    for (i in n - 2 downTo 0) suf[i] = minOf(suf[i + 1], nums[i])

    for (i in nums.indices) if (pref[i] - suf[i] <= k) res = minOf(res, i)

    return if (res == Int.MAX_VALUE) -1 else res
}
