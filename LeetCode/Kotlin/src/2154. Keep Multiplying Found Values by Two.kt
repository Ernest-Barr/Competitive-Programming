fun findFinalValue(nums: IntArray, original: Int): Int {
    val set = nums.toHashSet()
    var res = original

    while (res in set) res = res shl 1

    return res
}