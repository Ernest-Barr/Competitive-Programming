private fun missingMultiple(nums: IntArray, k: Int): Int {
    val set = nums.toSet()

    for (i in 1..101) if (k * i !in set) return k * i

    return 0
}
