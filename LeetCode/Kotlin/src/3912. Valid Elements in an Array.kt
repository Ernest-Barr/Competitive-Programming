fun findValidElements(nums: IntArray): List<Int> {
    val n = nums.size
    val pref: IntArray = IntArray(n) { nums[0] }
    val suf: IntArray = IntArray(n) { nums[n - 1] }
    val res: MutableList<Int> = mutableListOf()

    for (i in 1..<n) pref[i] = maxOf(pref[i - 1], nums[i])
    for (i in n - 2 downTo 0) suf[i] = maxOf(suf[i + 1], nums[i])

    res.add(nums[0])

    for (i in 1..<n - 1) {
        when {
            nums[i] > suf[i + 1] -> res.add(nums[i])
            nums[i] > pref[i - 1] -> res.add(nums[i])
        }
    }

    if (n != 1) res.add(nums[n - 1])

    return res
}
