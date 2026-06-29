private class SparseVector(val nums: IntArray) {
    // Return the dotProduct of two sparse vectors
    val set: MutableSet<Int> = mutableSetOf()

    init {
        for ((i, num) in nums.withIndex()) if (num != 0) set.add(i)
    }

    fun dotProduct(vec: SparseVector): Int {
        var res = 0
        val indices = set intersect vec.set

        for (i in indices) res += nums[i] * vec.nums[i]

        return res
    }
}
